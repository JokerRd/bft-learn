package com.bftcom.bftlearn.handlers;

import com.bftcom.bftlearn.dto.ErrorDto;
import com.bftcom.bftlearn.exceptions.TestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TestErrorHandler {

    @ExceptionHandler(TestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDto handleTestException(TestException exception){
        return new ErrorDto(exception.getMessage());
    }
}
