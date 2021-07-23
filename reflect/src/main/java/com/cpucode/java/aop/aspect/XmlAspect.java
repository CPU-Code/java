package com.cpucode.java.aop.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * XML版Aspect切面Bean(理解为TrsactionManager)
 *
 * @author : cpucode
 * @date : 2021/7/22
 * @time : 16:01
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class XmlAspect {
    private final static Logger log = Logger.getLogger(XmlAspect.class);

    /**
     * 配置前置通知,使用在方法aspect()上注册的切入点
     * 同时接受JoinPoint切入点对象,可以没有该参数
     * @param joinPoint
     */
    public void before(JoinPoint joinPoint){
        //获取实参列表
		System.out.println(joinPoint.getArgs());
        //连接点类型，如method-execution
		System.out.println(joinPoint.getKind());
        //获取被调用的切点
		System.out.println(joinPoint.getSignature());
        //获取目标对象
		System.out.println(joinPoint.getTarget());
        //获取this的值
		System.out.println(joinPoint.getThis());

        log.info("before " + joinPoint);
    }

    /**
     * 配置后置通知,使用在方法aspect()上注册的切入点
     * @param joinPoint
     */
    public void after(JoinPoint joinPoint){
        log.info("after " + joinPoint);
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

            log.info("around " + joinPoint + "\tUse time : " + (end - start) + " ms!");
        } catch (Throwable e) {
            long end = System.currentTimeMillis();

            log.info("around " + joinPoint + "\tUse time : " + (end - start) + " ms with exception : " + e.getMessage());
        }
    }

    /**
     * 配置后置返回通知,使用在方法aspect()上注册的切入点
     * @param joinPoint
     */
    public void afterReturn(JoinPoint joinPoint){
        log.info("afterReturn " + joinPoint);
    }

    /**
     * 配置抛出异常后通知,使用在方法aspect()上注册的切入点
     * @param joinPoint
     * @param ex
     */
    public void afterThrow(JoinPoint joinPoint, Exception ex){
        log.info("afterThrow " + joinPoint + "\t" + ex.getMessage());
    }
}
