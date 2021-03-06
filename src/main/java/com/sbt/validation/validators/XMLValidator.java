package com.sbt.validation.validators;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class XMLValidator extends CustomValidator {

    public XMLValidator(String xmlMessage, String xsdSchema){
        super(xmlMessage, xsdSchema);
    }

    @Override
    public boolean validate() {
        //Source xmlMessageSource = new StreamSource(new ByteArrayInputStream(message.getBytes(StandardCharsets.UTF_8)));
        Source xmlMessageSource = new StreamSource(new File("src/main/resources/STEP1_BODY.xml"));
        Source xsdSchemaSource = new StreamSource(new ByteArrayInputStream(schema.getBytes(StandardCharsets.UTF_8)));

        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        /*try(FileWriter writer = new FileWriter("XML.txt", false)) {
            Schema schema = schemaFactory.newSchema(xsdSchemaSource);
            Validator validator = schema.newValidator();
            for(int i = 0; i < 5000; i++){
                long startTime = System.currentTimeMillis();
                validator.validate(xmlMessageSource);
                long endTime = System.currentTimeMillis();
                writer.write(String.valueOf(endTime - startTime));
                writer.append(',');
            }

         */
        try {
            Workbook book = new HSSFWorkbook();
            Sheet sheet = book.createSheet("XML");
            Row row;
            Cell name;
            Schema schema = schemaFactory.newSchema(xsdSchemaSource);
            Validator validator = schema.newValidator();
            for(int i = 0; i < 5000; i++){
                row = sheet.createRow(i);
                name = row.createCell(0);
                long startTime = System.currentTimeMillis();
                validator.validate(xmlMessageSource);
                long endTime = System.currentTimeMillis();
                name.setCellValue(String.valueOf(endTime - startTime));
            }
            book.write(new FileOutputStream("xml.xls"));
            book.close();

        } catch(SAXException ex){
            System.err.println("Cannot parse. Cause: " + ex.getMessage());
            return false;
        } catch (IOException ex){
            System.err.println("Cannot open file for validation. Cause: " + ex.getMessage());
            return false;
        }

        return true;
    }
}
