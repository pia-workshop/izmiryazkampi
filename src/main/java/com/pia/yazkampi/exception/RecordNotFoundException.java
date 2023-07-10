package com.pia.yazkampi.exception;

public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException() {
        super("Record not found!!");
    }
}
