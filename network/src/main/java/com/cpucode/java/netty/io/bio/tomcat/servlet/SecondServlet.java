package com.cpucode.java.netty.io.bio.tomcat.servlet;

import com.cpucode.java.netty.io.bio.tomcat.http.CpRequest;
import com.cpucode.java.netty.io.bio.tomcat.http.CpResponse;
import com.cpucode.java.netty.io.bio.tomcat.http.CpServlet;

/**
 * @author : cpucode
 * @date : 2021/8/12 11:15
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SecondServlet extends CpServlet {
    @Override
    public void doGet(CpRequest request, CpResponse response) throws Exception {
        this.doPost(request, response);
    }

    @Override
    public void doPost(CpRequest request, CpResponse response) throws Exception {
        response.write("这是 模仿的 SecondServlet ");
    }
}
