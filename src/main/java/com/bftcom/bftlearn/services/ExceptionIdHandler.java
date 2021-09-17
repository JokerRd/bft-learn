package com.bftcom.bftlearn.services;

import javax.persistence.EntityNotFoundException;

public interface ExceptionIdHandler {

    void handleException(EntityNotFoundException exception);
}
