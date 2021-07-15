package com.cpucode.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * @CPRequestMapping 注解
 *
 * @author : cpucode
 * @date : 2021/7/15
 * @time : 20:36
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CPRequestMapping {
    String value() default "";
}
