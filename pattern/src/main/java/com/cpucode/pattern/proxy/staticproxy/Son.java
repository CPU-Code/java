package com.cpucode.pattern.proxy.staticproxy;

import com.cpucode.pattern.proxy.Person;

/**
 * @author : cpucode
 * @date : 2021/5/29
 * @time : 22:27
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子要求： 肤白貌美大长腿");
    }
}
