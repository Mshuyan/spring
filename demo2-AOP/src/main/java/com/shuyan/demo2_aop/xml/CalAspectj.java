package com.shuyan.demo2_aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

public class CalAspectj {

    private Object aroundMethod(ProceedingJoinPoint pjd){
        Object result = null;
        String methodName = pjd.getSignature().getName();
        try{
            System.out.println("before method " + methodName + "...");
            result = pjd.proceed();
            System.out.println("after method " + methodName + "...");
        }catch (Throwable throwable) {
            // 后置通知必须在这里再被调用1次，才能跟 @After 一致
            System.out.println("after method " + methodName + "...");
            System.out.println("afterThrowing method " + methodName + "...");
            // 这里必须将异常抛出，才能保证异常通知和返回通知只能被调用1个
            throw new RuntimeException("123");
        }
        System.out.println("afterReturning method " + methodName + "...");
        return result;
    }
}
