package com.cpucode.pattern.proxy.dynamicproxy.gpproxy;

import com.cpucode.pattern.proxy.Person;
import com.cpucode.pattern.proxy.dynamicproxy.Customer;

/**
 * @author : cpucode
 * @date : 2021/5/30
 * @time : 14:29
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GPProxyTest {
    public static void main(String[] args) {
        try {
            //JDK动态代理的实现原理
            Person obj = (Person) new GPMeipo().getInstance(new Customer());
            System.out.println(obj);

            obj.findLove();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
