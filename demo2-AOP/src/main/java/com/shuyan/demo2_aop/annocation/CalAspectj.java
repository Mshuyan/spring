package com.shuyan.demo2_aop.annocation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Order(1)
@Aspect
@Component
public class CalAspectj {

/*
    @Pointcut(value = "execution(* com.shuyan.demo2_aop.Cal.*(..))")
    public void method(){}

    @Before("execution(* com.shuyan.demo2_aop.Cal.*(..))")
    private void beforeMethod(JoinPoint joinPoint){
        System.out.println("before method: " + joinPoint.getSignature().getName());
        System.out.println("args  : " + Arrays.asList(joinPoint.getArgs()));
    }

    @After("execution(* com.shuyan.demo2_aop.Cal.*(..))")
    private void afterMethod(JoinPoint joinPoint){
        System.out.println("after method: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "execution(* com.shuyan.demo2_aop.Cal.*(..))",returning = "result")
    private void afterReturning(JoinPoint joinPoint,Object result){
        System.out.println("after return method: " + joinPoint.getSignature().getName());
        System.out.println("return: " + result);
    }

    @AfterThrowing(value = "execution(* com.shuyan.demo2_aop.Cal.*(..))",throwing = "e")
    private void afterThrowing(JoinPoint joinPoint,Exception e){
        System.out.println("after throwing method: " + joinPoint.getSignature().getName());
        System.out.println("exception: " + e);
    }
*/

    @Around(value = "execution(* com.shuyan.demo2_aop.Cal.*(..))")
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
