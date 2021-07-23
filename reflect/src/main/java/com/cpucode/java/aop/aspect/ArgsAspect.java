package com.cpucode.java.aop.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 获取参数Aspect切面Bean
 * @Component  声明这是一个组件
 * @Aspect  声明这是一个切面Bean
 * @author : cpucode
 * @date : 2021/7/22
 * @time : 16:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Component
@Aspect
public class ArgsAspect {
    private final static Logger log = Logger.getLogger(ArgsAspect.class);

    /**
     * 配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
     */
    @Pointcut("execution(* com.cpucode.java.aop.service..*(..))")
    public void aspect(){
        System.out.println("aspect() @Pointcut");
    }

    /**
     * 配置前置通知,拦截返回值为 com.cpucode.java.aop.model.Member 的方法
     * @param joinPoint
     */
    @Before("execution(com.cpucode.java.aop.model.Member com.cpucode.java.aop.service..*(..))")
    public void beforeReturnUser(JoinPoint joinPoint){
        log.info("beforeReturnUser " + joinPoint);
    }

    /**
     * 配置前置通知,拦截参数为 com.cpucode.java.aop.model.Member 的方法
     * @param joinPoint
     */
    @Before("execution(* com.cpucode.java.aop.service..*(com.cpucode.java.aop.model.Member))")
    public void beforeArgUser(JoinPoint joinPoint){
        log.info("beforeArgUser " + joinPoint);
    }

    /**
     * 配置前置通知,拦截含有long类型参数的方法,并将参数值注入到当前方法的形参id中
     * @param joinPoint
     * @param id
     */
    @Before("aspect()&&args(id)")
    public void beforeArgId(JoinPoint joinPoint, long id){
        log.info("beforeArgId " + joinPoint + "\tID:" + id);
    }
}
