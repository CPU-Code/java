package com.cpucode.netty.io.bin.tomcat.servlet;

import com.cpucode.netty.io.bin.tomcat.http.CpRequest;
import com.cpucode.netty.io.bin.tomcat.http.CpResponse;
import com.cpucode.netty.io.bin.tomcat.http.CpServlet;

/**
 * @author : cpucode
 * @date : 2021/8/12 13:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class FirstServlet extends CpServlet {
    @Override
    public void doGet(CpRequest request, CpResponse response) throws Exception {
        this.doPost(request, response);
    }

    @Override
    public void doPost(CpRequest request, CpResponse response) throws Exception {
        response.write("这是 cpucode 的 FirstServlet ");
    }
}
