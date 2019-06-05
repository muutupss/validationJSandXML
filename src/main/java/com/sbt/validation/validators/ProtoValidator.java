package com.sbt.validation.validators;

import com.github.fge.jsonschema.exceptions.ProcessingException;
import com.sbt.validation.proto.Truevalid;
import com.sbt.validation.proto.Valid;
import no.entur.protobuf.validation.MessageValidationException;
import no.entur.protobuf.validation.ProtobufValidator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ProtoValidator extends CustomValidator {

    public ProtoValidator(String message, String schema) {
        super(message, schema);
    }

    @Override
    public boolean validate() throws IOException, ProcessingException, MessageValidationException {

        Truevalid.NotifySMITZNOStatusRq.Builder me = Truevalid.NotifySMITZNOStatusRq.newBuilder();
        me.setNumber1("");
        me.setNumber2("");
        me.setNumber3("");
        me.setNumber4("");
        me.setNumber5("");
        me.setNumber6("");
        me.setNumber7("");
        me.setNumber8("");
        me.setNumber9("");
        me.setNumber10("");
        me.setNumber11("");
        me.setNumber12("");
        me.setNumber13("");
        me.setNumber14("");
        me.setNumber15("");
        me.setNumber16("");
        me.setNumber17("");
        me.setNumber18("");
        me.setNumber19("");
        me.setNumber20("");
        me.setNumber21("");
        me.setNumber22("");
        me.setNumber23("");
        me.setNumber24("");
        me.setNumber25("");
        me.setNumber26("");
        me.setNumber27("");
        me.setNumber28("");
        me.setNumber29("");
        me.setNumber30("");
        me.setNumber31("");
        me.setNumber32("");
        me.setNumber33("");
        me.setNumber34("");
        me.setNumber35("");
        me.setNumber36("");
        me.setNumber37("");
        me.setNumber38("");
        me.setNumber39("");
        me.setNumber40("");

        Truevalid.NotifySMITZNOStatusRq protoMessage = me.build();
        ProtobufValidator validator = new ProtobufValidator();

        Workbook book = new HSSFWorkbook();
        Sheet sheet = book.createSheet("JSON");
        Row row;
        Cell name;

        for (int i = 0; i < 5000; i++){
            row = sheet.createRow(i);
            name = row.createCell(0);
            long startTime = System.currentTimeMillis();
            validator.validate(protoMessage);
            long endTime = System.currentTimeMillis();
            name.setCellValue(String.valueOf(endTime - startTime));
        }

        book.write(new FileOutputStream("proto.xls"));
        book.close();


        return false;
    }
}
