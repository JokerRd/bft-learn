package com.bftcom.bftlearn.exceptions;

public class TestException extends RuntimeException{

    public TestException(String message){
        super(message);
    }

    public TestException(String message, Throwable caused){
        super(message, caused);
    }
}
