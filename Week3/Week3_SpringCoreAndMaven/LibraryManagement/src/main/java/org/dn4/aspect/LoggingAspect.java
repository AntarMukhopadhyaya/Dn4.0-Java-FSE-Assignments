package org.dn4.aspect;


import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();  // call actual method

        long end = System.currentTimeMillis();
        String methodName = joinPoint.getSignature().toShortString();
        System.out.println("[AOP] " + methodName + " executed in " + (end - start) + " ms");

        return result;
    }
}