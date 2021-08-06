package com.cpucode.spring.formework.annotation;

import java.lang.annotation.*;

/**
 * 自动注入
 * @author cpucode
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CPAutowired {
    String value() default "";
}
