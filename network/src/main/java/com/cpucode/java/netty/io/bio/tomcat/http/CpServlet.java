package com.cpucode.java.netty.io.bio.tomcat.http;

/**
 * @author : cpucode
 * @date : 2021/8/12 11:15
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public abstract class CpServlet {

    public void service(CpRequest request, CpResponse response) throws Exception{
        if("GET".equalsIgnoreCase(request.getMethod())){
            doGet(request, response);
        }else{
            doPost(request, response);
        }
    }

    public abstract void doGet(CpRequest request, CpResponse response) throws Exception;
    public abstract void doPost(CpRequest request, CpResponse response) throws Exception;
}
