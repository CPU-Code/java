package com.cpucode.spring.formework.webmvc.servlet;

import lombok.Data;

import java.util.Map;

/**
 * @author : cpucode
 * @date : 2021/8/4
 * @time : 14:15
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Data
public class CPModelAndView {
    private String viewName;
    private Map<String, ?> model;

    public CPModelAndView(String viewName) {
        this(viewName,null);
    }

    public CPModelAndView(String viewName, Map<String, ?> model) {
        this.viewName = viewName;
        this.model = model;
    }
}
