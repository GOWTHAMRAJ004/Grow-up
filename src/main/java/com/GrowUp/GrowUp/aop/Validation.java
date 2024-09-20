package com.GrowUp.GrowUp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Validation {
    private static final Logger LOGGER = LoggerFactory.getLogger(Validation.class);
    @Around("execution(* com.GrowUp.GrowUp.service.job.*(..)) && args(postId)")
     public Object valid(ProceedingJoinPoint jp , int postId ){
        if(postId < 0){
            LOGGER.info("the validation was called ");
            postId = -postId;
            LOGGER.info("");
        }
    }
}
