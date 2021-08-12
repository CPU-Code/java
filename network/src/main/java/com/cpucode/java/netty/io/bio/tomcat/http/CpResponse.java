package com.cpucode.java.netty.io.bio.tomcat.http;

import java.io.OutputStream;

/**
 * @author : cpucode
 * @date : 2021/8/12 11:15
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CpResponse {
    private OutputStream out;

    public CpResponse(OutputStream out){
        this.out = out;
    }

    public void write(String s) throws Exception {
        //用的是HTTP协议，输出也要遵循HTTP协议
        //给到一个状态码 200
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP/1.1 200 OK \n")
                .append("Context-Type: text/html;\n")
                .append("\r\n")
                .append(s);

        out.write(sb.toString().getBytes());
    }
}
