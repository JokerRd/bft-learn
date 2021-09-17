package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.exceptions.TestException;

import javax.persistence.EntityNotFoundException;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdEntityValidator implements ConstraintValidator<IdEntity, EntityNotFoundException> {

    private String message;

    @Override
    public void initialize(IdEntity constraintAnnotation) {
        this.message = constraintAnnotation.message();
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(EntityNotFoundException e,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (e != null) {
            throw new  TestException(message, e);
        }
        return true;
    }

}
