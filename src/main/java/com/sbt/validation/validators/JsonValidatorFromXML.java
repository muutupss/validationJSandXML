package com.sbt.validation.validators;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonValidator;

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

        long startTime = System.currentTimeMillis();
        //ProcessingReport report = v.validate(s, d);
        v.validate(s, d);
        long endTime = System.currentTimeMillis();

        System.out.println("Непосредственно Json валидация занимает " + (endTime - startTime) + " мс.");
        //System.out.println(report);
        return false;
    }


}