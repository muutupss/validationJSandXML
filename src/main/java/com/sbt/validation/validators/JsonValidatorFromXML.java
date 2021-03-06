package com.sbt.validation.validators;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonValidator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class JsonValidatorFromXML extends CustomValidator {

    public JsonValidatorFromXML(String message, String schema) {
        super(message, schema);
    }

    @Override
    public boolean validate() throws IOException, ProcessingException {
        final JsonNode d = JsonLoader.fromString(message);
        final JsonNode s = JsonLoader.fromString(schema);

        final JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonValidator v = factory.getValidator();
        //ProcessingReport report = v.validate(s, d);

        /*FileWriter writer = new FileWriter("JSON.txt", false);
        for (int i = 0; i < 5000; i++){
            long startTime = System.currentTimeMillis();
            v.validate(s, d);
            long endTime = System.currentTimeMillis();
            writer.write(String.valueOf(endTime - startTime));
            writer.append(',');
        } */
        Workbook book = new HSSFWorkbook();
        Sheet sheet = book.createSheet("JSON");
        Row row;
        Cell name;

        for (int i = 0; i < 5000; i++){
            row = sheet.createRow(i);
            name = row.createCell(0);
            long startTime = System.currentTimeMillis();
            v.validate(s, d);
            long endTime = System.currentTimeMillis();
            name.setCellValue(String.valueOf(endTime - startTime));
        }

        book.write(new FileOutputStream("json.xls"));
        book.close();

        //System.out.println(report);
        return false;
    }


}