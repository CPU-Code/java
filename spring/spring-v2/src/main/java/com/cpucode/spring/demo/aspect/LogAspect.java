package com.cpucode.spring.demo.aspect;

import com.cpucode.spring.formework.aop.aspect.CPJoinPoint;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @author : cpucode
 * @date : 2021/8/6
 * @time : 14:06
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Slf4j
public class LogAspect {

    /**
     * 在调用一个方法之前， 执行 before 方法
     * @param joinPoint
     */
    public void before(CPJoinPoint joinPoint){
        log.info("Invoker Before Method!!!" +
                "\nTargetObject:" + joinPoint.getThis() +
                "\nArgs:" + Arrays.toString(joinPoint.getArguments()));
    }

    /**
     * 在调用一个方法之后， 执行 after 方法
     * @param joinPoint
     */
    public void after(CPJoinPoint joinPoint){
        log.info("Invoker After Method!!!" +
                "\nTargetObject:" + joinPoint.getThis() +
                "\nArgs:" + Arrays.toString(joinPoint.getArguments()));
    }

    /**
     * 异常
     * @param joinPoint
     * @param ex
     */
    public void afterThrowing(CPJoinPoint joinPoint, Throwable ex){
        log.info("出现异常" +
                "\nTargetObject:" + joinPoint.getThis() +
                "\nArgs:" + Arrays.toString(joinPoint.getArguments()) +
                "\nThrows:" + ex.getMessage());
    }
}
