package com.cpucode.java.aop.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Annotation版Aspect切面Bean
 *
 * @Component  声明这是一个组件
 * @Aspect  声明这是一个切面Bean，AnnotaionAspect是一个面，由框架实现的
 *
 * @author : cpucode
 * @date : 2021/7/22
 * @time : 16:23
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Component
@Aspect
public class AnnotaionAspect {

    private final static Logger log = Logger.getLogger(AnnotaionAspect.class);

    /**
     * 配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
     * 切点的集合，这个表达式所描述的是一个虚拟面（规则）
     * 就是为了Annotation扫描时能够拿到注解中的内容
     */
    @Pointcut("execution(* com.cpucode.java.aop.aspect..*(..))")
    public void aspect(){}

    /**
     * 配置前置通知,使用在方法aspect()上注册的切入点
     * 同时接受JoinPoint切入点对象,可以没有该参数
     * @param joinPoint
     */
    @Before("aspect()")
    public void before(JoinPoint joinPoint){
        log.info("before " + joinPoint);
    }

    /**
     * 配置后置通知,使用在方法aspect()上注册的切入点
     * @param joinPoint
     */
    @After("aspect()")
    public void after(JoinPoint joinPoint){
        log.info("after " + joinPoint);
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

            log.info("around " + joinPoint + "\tUse time : " + (end - start) + " ms!");
        } catch (Throwable e) {
            long end = System.currentTimeMillis();

            log.info("around " + joinPoint +
                    "\tUse time : " + (end - start) +
                    " ms with exception : " + e.getMessage());
        }
    }

    /**
     * 配置后置返回通知,使用在方法aspect()上注册的切入点
     * @param joinPoint
     */
    @AfterReturning("aspect()")
    public void afterReturn(JoinPoint joinPoint){
        log.info("afterReturn " + joinPoint);
    }

    /**
     * 配置抛出异常后通知,使用在方法aspect()上注册的切入点
     * @param joinPoint
     * @param ex
     */
    @AfterThrowing(pointcut="aspect()", throwing="ex")
    public void afterThrow(JoinPoint joinPoint, Exception ex){
        log.info("afterThrow " + joinPoint + "\t" + ex.getMessage());
    }
}
