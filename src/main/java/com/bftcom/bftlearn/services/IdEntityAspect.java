package com.bftcom.bftlearn.services;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import javax.persistence.EntityNotFoundException;

@Aspect
@Component
public class IdEntityAspect {


    @AfterThrowing(pointcut = "@annotation(IdEntity)", throwing = "ex", argNames = "ex,joinPoint")
    public void beforeCallAtMethod1(EntityNotFoundException ex, JoinPoint joinPoint) {

    }
}
