package com.cpucode.spring.formework.annotation;

import java.lang.annotation.*;

/**
 * 请求参数映射
 *
 * @author : cpucode
 * @date : 2021/8/2
 * @time : 13:32
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CPRequestParam {
    String value() default "";
}
