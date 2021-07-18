package com.cpucode.demo.mvc.action;

import com.cpucode.demo.service.IDemoService;
import com.cpucode.mvcframework.annotation.CPAutowired;
import com.cpucode.mvcframework.annotation.CPController;
import com.cpucode.mvcframework.annotation.CPRequestMapping;
import com.cpucode.mvcframework.annotation.CPRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 配置请求入口类
 *
 * @author : cpucode
 * @date : 2021/7/15
 * @time : 20:15
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@CPController
@CPRequestMapping("/demo")
public class DemoAction {
    @CPAutowired
    private IDemoService demoService;

    @CPRequestMapping("/query")
    public void query(HttpServletRequest req,
                      HttpServletResponse resp,
                      @CPRequestParam("name") String name){
        String result = demoService.get(name);

        try {
            resp.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @CPRequestMapping("/add")
    public void add(HttpServletRequest req,
                    HttpServletResponse resp,
                    @CPRequestParam("a") Integer a,
                    @CPRequestParam("b") Integer b){
        try {
            resp.getWriter().write(a + "+" + b + "=" + (a + b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @CPRequestMapping("/remove")
    public void remove(HttpServletRequest req,
                       HttpServletResponse resp){
        try {
            resp.getWriter().write("cpucode");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
