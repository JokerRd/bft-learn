package com.bftcom.bftlearn.services;

import javax.persistence.EntityNotFoundException;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target( { ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IdEntity {

}
