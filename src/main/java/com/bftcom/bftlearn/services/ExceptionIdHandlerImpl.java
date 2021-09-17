package com.bftcom.bftlearn.services;

import javax.persistence.EntityNotFoundException;

public class ExceptionIdHandlerImpl implements ExceptionIdHandler{

    @Override
    public void handleException(EntityNotFoundException exception) {
        
    }
}
