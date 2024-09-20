package com.GrowUp.GrowUp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.GrowUp.GrowUp.service.job.*(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method called: " + jp.getSignature().getName() + " with arguments: " + jp.getArgs());
    }

    @After("execution(* com.GrowUp.GrowUp.service.job.*(..))")
    public void logAfterMethodCall(JoinPoint jp) {
        LOGGER.info("Method completed: " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.GrowUp.GrowUp.service.job.*(..))")
    public void logMethodAfterReturnCall(JoinPoint jp) {
        LOGGER.info("Method executed successfully: " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.GrowUp.GrowUp.service.job.*(..))")
    public void logMethodException(JoinPoint jp) {
        LOGGER.error("Exception in method: " + jp.getSignature().getName());
    }
}
