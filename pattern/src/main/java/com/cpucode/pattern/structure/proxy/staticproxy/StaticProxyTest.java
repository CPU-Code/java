package com.cpucode.pattern.structure.proxy.staticproxy;

/**
 * @author : cpucode
 * @date : 2021/5/29
 * @time : 23:13
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());

        father.findLove();
    }
}
