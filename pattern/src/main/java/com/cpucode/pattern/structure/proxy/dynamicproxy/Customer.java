package com.cpucode.pattern.structure.proxy.dynamicproxy;

import com.cpucode.pattern.structure.proxy.Person;

/**
 * @author : cpucode
 * @date : 2021/5/30
 * @time : 11:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高 180cm");
        System.out.println("胸大， 6 块腹肌");
    }
}
