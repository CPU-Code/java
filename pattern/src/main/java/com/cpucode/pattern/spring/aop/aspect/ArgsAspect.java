package com.cpucode.pattern.spring.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 获取参数Aspect切面Bean
 *
 * @Component: 声明这是一个组件
 * @Aspect: 声明这是一个切面Bean
 * @author : cpucode
 * @date : 2021/7/13
 * @time : 22:12
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Component
@Aspect
@Slf4j
public class ArgsAspect {
    /**
     * 配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
     */
    @Pointcut("execution(* com.cpucode.pattern.spring.aop.service..*(..))")
    public void aspect(){	}

    /**
     * 配置前置通知,拦截返回值为cn.ysh.studio.spring.mvc.bean.User的方法
     * @param joinPoint
     */
    @Before("execution(com.gupaoedu.vip.pattern.spring.aop.model.Member com.cpucode.pattern.spring.aop.service..*(..))")
    public void beforeReturnUser(JoinPoint joinPoint){
        log.info("beforeReturnUser " + joinPoint);
    }

    /**
     * 配置前置通知,拦截参数为cn.ysh.studio.spring.mvc.bean.User的方法
     * @param joinPoint
     */
    @Before("execution(* com.cpucode.pattern.spring.aop.service..*(com.gupaoedu.vip.pattern.spring.aop.model.Member))")
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
