package com.cpucode.java.netty.io.bio.tomcat.http;

import lombok.Data;

import java.io.InputStream;

/**
 * @author : cpucode
 * @date : 2021/8/12 11:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Data
public class CpRequest {
    private String method;
    private String url;

    public CpRequest(InputStream in){
        try {
            //拿到HTTP协议内容
            String context = "";
            byte[] buff = new byte[1024];
            int len = 0;

            if ((len = in.read(buff)) > 0 ){
                context = new String(buff, 0, len);
            }
            // 换行
            String line = context.split("\\n")[0];
            String [] arr = line.split("\\s");

            this.method = arr[0];
            this.url = arr[1].split("\\?")[0];

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
