package com.cpucode.netty.io.bin.tomcat.http;

/**
 * @author : cpucode
 * @date : 2021/8/12 13:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public abstract class CpServlet {
    public void service(CpRequest request, CpResponse response) throws Exception{

        //由service方法来决定，是调用doGet或者调用doPost
        if("GET".equalsIgnoreCase(request.getMethod())){
            doGet(request, response);
        }else{
            doPost(request, response);
        }

    }

    public abstract void doGet(CpRequest request,CpResponse response) throws Exception;

    public abstract void doPost(CpRequest request,CpResponse response) throws Exception;

}
