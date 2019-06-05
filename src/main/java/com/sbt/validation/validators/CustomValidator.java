package com.sbt.validation.validators;

import com.github.fge.jsonschema.exceptions.ProcessingException;
import no.entur.protobuf.validation.MessageValidationException;

import java.io.IOException;

public abstract class CustomValidator {
    String message, schema;

    public CustomValidator(String message, String schema) {
        this.message = message;
        this.schema = schema;
    }

    public abstract boolean validate() throws IOException, ProcessingException, MessageValidationException;

    public long repeatValidationManyTimes(int times){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < times; i++){
            try {
                validate();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ProcessingException e) {
                e.printStackTrace();
            } catch (MessageValidationException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }
}
