package com.cpucode.spring.demo.action;

import com.cpucode.spring.demo.service.IQueryService;
import com.cpucode.spring.formework.annotation.CPAutowired;
import com.cpucode.spring.formework.annotation.CPController;
import com.cpucode.spring.formework.annotation.CPRequestMapping;
import com.cpucode.spring.formework.annotation.CPRequestParam;
import com.cpucode.spring.formework.webmvc.servlet.CPModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 公布接口 url
 *
 * @author : cpucode
 * @date : 2021/8/5
 * @time : 19:08
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@CPController
@CPRequestMapping("/")
public class PageAction {

    @CPAutowired
    IQueryService queryService;

    @CPRequestMapping("/first.html")
    public CPModelAndView query(@CPRequestParam("teacher") String teacher){
        String result = queryService.query(teacher);

        Map<String, Object> model = new HashMap<String,Object>();
        model.put("teacher", teacher);
        model.put("data", result);
        model.put("token", "123456");

        return new CPModelAndView("first.html", model);
    }

}
