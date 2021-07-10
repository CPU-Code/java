package com.cpucode.pattern.structure.proxy.simpleproxy;

/**
 * @author : cpucode
 * @date : 2021/5/30
 * @time : 17:50
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
