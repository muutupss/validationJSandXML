package com.sbt.validation;

import com.sbt.validation.util.Converter;
import com.sbt.validation.util.PathConstants;
import com.sbt.validation.validators.CustomValidator;
import com.sbt.validation.validators.JsonValidatorFromXML;
import com.sbt.validation.validators.ProtoValidator;
import com.sbt.validation.validators.XMLValidator;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class App {
/*    private static String PATH_TO_XML_MESSAGE = "src\\main\\resources\\STEP1_BODY.xml";
    private static String PATH_TO_XSD_SCHEMA = "src\\main\\resources\\SrvNotifySMITZNOStatus2019-1Ver001.xsd";*/

    public static void main(String... args){
        String xmlMessage, xsdSchema;
        try {
            xmlMessage = FileUtils.readFileToString(new File(PathConstants.PATH_TO_XML_MESSAGE), "UTF-8");
            xsdSchema = FileUtils.readFileToString(new File(PathConstants.PATH_TO_XSD_SCHEMA), "UTF-8");
        } catch (IOException ex){
            System.err.println(ex.getMessage());
            return;
        }
        //analyzeValidator(new XMLValidator(xmlMessage, xsdSchema));

        String jsonMessage, jsonSchema;
        jsonMessage = Converter.xmlToJson(xmlMessage);
        jsonSchema = Converter.xsdToJsonSchema(xsdSchema);

        System.out.println(jsonMessage);


        analyzeValidator(new ProtoValidator(jsonMessage, jsonSchema));
        //analyzeValidator(new JsonValidatorFromXML(jsonMessage, jsonSchema));
    }

    private static void analyzeValidator(CustomValidator customValidator){
        //if(customValidator.validate())
        //TODO:make number of times constant
        System.out.println("Валидация с учетом создания дополнительных утилитных объектов занимает " +
                customValidator.repeatValidationManyTimes(1) + " мс.");
/*        else {
            System.err.println("Validation failed at high level.");
        }*/
    }
}