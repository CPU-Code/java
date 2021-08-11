package com.cpucode.rpc;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : cpucode
 * @date : 2021/8/11 15:54
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface RpcService {
    /**
     * 拿到服务的接口
     * @return
     */
    Class<?> value();

    /**
     * 版本号
     */
    String version() default "";
}
