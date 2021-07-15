package com.cpucode.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * @CPService 注解
 *
 * @author : cpucode
 * @date : 2021/7/15
 * @time : 20:23
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CPService {
    String value() default "";
}
