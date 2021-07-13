package com.cpucode.pattern.spring.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Annotation版Aspect切面Bean
 *
 * @author : cpucode
 * @date : 2021/7/13
 * @time : 21:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Component
@Aspect
@Slf4j
public class AnnotaionAspect {

    /**
     * 配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
     */
    @Pointcut("execution(* com.cpucode.pattern.spring.aop.aspect..*(..))")
    public void aspect(){

    }

    /**
     * 配置前置通知,使用在方法aspect()上注册的切入点
     * 同时接受JoinPoint切入点对象,可以没有该参数
     */
    @Before("aspect()")
    public void before(JoinPoint joinPoint){

        log.info("before通知 " + joinPoint);
    }

    /**
     * 配置后置通知,使用在方法aspect()上注册的切入点
     * @param joinPoint
     */
    @After("aspect()")
    public void after(JoinPoint joinPoint){

        log.info("after通知  " + joinPoint);
    }

    /**
     * 配置环绕通知,使用在方法aspect()上注册的切入点
     * @param joinPoint
     */
    @Around("aspect()")
    public void around(JoinPoint joinPoint){
        long start = System.currentTimeMillis();

        try {
            ((ProceedingJoinPoint) joinPoint).proceed();
            long end = System.currentTimeMillis();

            log.info("around通知 " + joinPoint + "\tUse time : " + (end - start) + " ms!");
        } catch (Throwable e) {
            long end = System.currentTimeMillis();

            log.info("around通知 " + joinPoint + "\tUse time : " + (end - start) + " ms with exception : " + e.getMessage());
        }
    }

    /**
     * 配置后置返回通知,使用在方法aspect()上注册的切入点
     * @param joinPoint
     */
    @AfterReturning("aspect()")
    public void afterReturn(JoinPoint joinPoint){
        log.info("afterReturn通知 " + joinPoint);
    }

    /**
     * 配置抛出异常后通知,使用在方法aspect()上注册的切入点
     *
     * @param joinPoint
     * @param ex
     */
    @AfterThrowing(pointcut="aspect()", throwing="ex")
    public void afterThrow(JoinPoint joinPoint, Exception ex){
        log.info("afterThrow通知 " + joinPoint + "\t" + ex.getMessage());
    }
}
