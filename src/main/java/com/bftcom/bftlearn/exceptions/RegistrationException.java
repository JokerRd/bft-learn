package com.bftcom.bftlearn.exceptions;

public class RegistrationException extends RuntimeException {

    public RegistrationException(String message){
        super(message);
    }

    public RegistrationException(String message, Throwable caused){
        super(message, caused);
    }

}
