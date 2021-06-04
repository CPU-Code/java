package com.cpucode.pattern.adapter.power.adapter;

/**
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 21:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        Dc5 dc5 = new PowerAdapter(new Ac220());

        dc5.outPutDc5V();
    }
}
