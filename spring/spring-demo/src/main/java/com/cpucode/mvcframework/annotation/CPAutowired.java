package com.cpucode.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * CPAutowired注解
 * @author cpucode
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CPAutowired {
    String value() default "";
}
