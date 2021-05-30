package com.cpucode.pattern.proxy.dynamicproxy.jdkproxy;

import com.cpucode.pattern.proxy.Person;
import com.cpucode.pattern.proxy.dynamicproxy.Customer;

/**
 * @author : cpucode
 * @date : 2021/5/30
 * @time : 11:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JDKProxyTest {
    public static void main(String[] args) {

        try {
            Person instance = (Person)new JDKMeipo().getInstance(new Customer());

            instance.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
