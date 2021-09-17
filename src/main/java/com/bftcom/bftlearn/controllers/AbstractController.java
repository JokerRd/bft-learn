package com.bftcom.bftlearn.controllers;

import com.bftcom.bftlearn.exceptions.TestException;
import com.bftcom.bftlearn.services.EntityService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

public abstract class AbstractController<EntityDto> {
    final EntityService<EntityDto> service;

    protected AbstractController(EntityService<EntityDto> service) {
        this.service = service;
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public void checkId(EntityNotFoundException exception){
        throw new TestException(service.getNotFoundIdEntity(), exception);
    }
}
