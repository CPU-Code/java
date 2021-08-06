package com.cpucode.spring.formework.webmvc.servlet;

import lombok.Data;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @author : cpucode
 * @date : 2021/8/4
 * @time : 14:12
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Data
public class CPHandlerMapping {
    /**
     * 保存方法对应的实例
     */
    private Object controller;
    /**
     * 保存映射的方法
     */
    private Method method;
    /**
     * URL的正则匹配
     */
    private Pattern pattern;

    public CPHandlerMapping(Pattern pattern, Object controller, Method method) {
        this.controller = controller;
        this.method = method;
        this.pattern = pattern;
    }
}
