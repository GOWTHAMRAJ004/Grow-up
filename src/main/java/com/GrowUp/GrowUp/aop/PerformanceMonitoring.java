package com.GrowUp.GrowUp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
// used to monitor the performance in the effectve way
public class PerformanceMonitoring {
    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitoring.class);

    @Around("execution(* com.GrowUp.GrowUp.service.job.*(..))")
    public Object monitorTime(ProceedingJoinPoint  jp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = jp.proceed();

        long end = System.currentTimeMillis();
        LOGGER.info("time taken by "+ jp.getSignature().getName() + " : " + (end - start)+ "ms");
        return obj;
    }
}
