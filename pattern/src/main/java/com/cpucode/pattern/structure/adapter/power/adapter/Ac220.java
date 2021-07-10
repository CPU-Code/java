package com.cpucode.pattern.structure.adapter.power.adapter;

/**
 * 220V 交流电
 *
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 21:00
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Ac220 {
    public int outputAC220V(){
        int output = 220;

        System.out.println("输出交流电" + output + "V");

        return output;
    }
}
