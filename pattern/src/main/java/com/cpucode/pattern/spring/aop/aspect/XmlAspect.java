package com.cpucode.pattern.spring.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * XML版Aspect切面Bean
 *
 * @author : cpucode
 * @date : 2021/7/13
 * @time : 22:12
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Slf4j
public class XmlAspect {

    /**
     * 配置前置通知,使用在方法 aspect()上注册的切入点
     * 同时接受 JoinPoint 切入点对象,可以没有该参数
     */
    public void before(JoinPoint joinPoint){
        //获取实参列表
        log.info("" + joinPoint.getArgs());
        //连接点类型，如method-execution
        log.info("" + joinPoint.getKind());
        //获取被调用的切点
        log.info("" + joinPoint.getSignature());
        //获取目标对象
        log.info("" + joinPoint.getTarget());
        //获取this的值
        log.info("" + joinPoint.getThis());

        log.info("before通知 " + joinPoint);
    }

    /**
     * 配置后置通知,使用在方法aspect()上注册的切入点
     * @param joinPoint
     */
    public void after(JoinPoint joinPoint){
        log.info("after通知 " + joinPoint);
    }

    /**
     * 配置环绕通知,使用在方法aspect()上注册的切入点
     * @param joinPoint
     */
    public void around(JoinPoint joinPoint){
        long start = System.currentTimeMillis();

        try {
            ((ProceedingJoinPoint) joinPoint).proceed();
            long end = System.currentTimeMillis();

            log.info("around通知 " + joinPoint +
                    "\tUse time : " + (end - start) + " ms!");
        } catch (Throwable e) {
            long end = System.currentTimeMillis();

            log.info("around通知 " + joinPoint +
                    "\tUse time : " + (end - start) +
                    " ms with exception : " + e.getMessage());
        }
    }

    /**
     * 配置后置返回通知,使用在方法aspect()上注册的切入点
     * @param joinPoint
     */
    public void afterReturn(JoinPoint joinPoint){
        log.info("afterReturn通知 " + joinPoint);
    }

    /**
     * 配置抛出异常后通知,使用在方法aspect()上注册的切入点
     * @param joinPoint
     * @param ex
     */
    public void afterThrow(JoinPoint joinPoint, Exception ex){
        log.info("afterThrow通知 " + joinPoint + "\t" + ex.getMessage());
    }
}
