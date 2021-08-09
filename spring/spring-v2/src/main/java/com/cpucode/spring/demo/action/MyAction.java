package com.cpucode.spring.demo.action;

import com.cpucode.spring.demo.service.IModifyService;
import com.cpucode.spring.demo.service.IQueryService;
import com.cpucode.spring.formework.annotation.CPAutowired;
import com.cpucode.spring.formework.annotation.CPController;
import com.cpucode.spring.formework.annotation.CPRequestMapping;
import com.cpucode.spring.formework.annotation.CPRequestParam;
import com.cpucode.spring.formework.webmvc.servlet.CPModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 公布接口 url
 *
 * @author : cpucode
 * @date : 2021/8/5
 * @time : 19:06
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@CPController
@CPRequestMapping("/web")
public class MyAction {
    @CPAutowired
    IQueryService queryService;
    @CPAutowired
    IModifyService modifyService;

    @CPRequestMapping("/query.json")
    public CPModelAndView query(HttpServletRequest request, HttpServletResponse response,
                                @CPRequestParam("name") String name){
        String result = queryService.query(name);

        return out(response, result);
    }

    @CPRequestMapping("/add*.json")
    public CPModelAndView add(HttpServletRequest request,HttpServletResponse response,
                              @CPRequestParam("name") String name,
                              @CPRequestParam("addr") String addr){
        String result = null;
        try {
            result = modifyService.add(name, addr);

            return out(response, result);
        } catch (Exception e) {
            e.printStackTrace();
            Map<String,Object> model = new HashMap<String, Object>();
            model.put("detail",e.getCause().getMessage());
            model.put("stackTrace", Arrays.toString(e.getStackTrace()).replaceAll("\\[|\\]",""));

            return new CPModelAndView("500", model);
        }
    }

    @CPRequestMapping("/remove.json")
    public CPModelAndView remove(HttpServletRequest request,HttpServletResponse response,
                                 @CPRequestParam("id") Integer id){
        String result = modifyService.remove(id);
        return out(response, result);
    }

    @CPRequestMapping("/edit.json")
    public CPModelAndView edit(HttpServletRequest request,HttpServletResponse response,
                               @CPRequestParam("id") Integer id,
                               @CPRequestParam("name") String name){
        String result = modifyService.edit(id, name);
        return out(response, result);
    }

    private CPModelAndView out(HttpServletResponse resp,String str){
        try {
            resp.getWriter().write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
