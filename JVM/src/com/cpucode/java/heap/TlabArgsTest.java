/**
 * User: cpucode
 * Date: 2021/1/6
 * Time: 14:32
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.heap;

/*
 测试-XX:UseTLAB参数是否开启的情况:默认情况是开启的
* */
public class TlabArgsTest {
    public static void main(String[] args) {
        System.out.printf("我是CPUCode");

        try{
            Thread.sleep(100000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

/*

C:\Users\cpucode>jps
12692 TLABArgsTest
18420
22308 Jps
4804 org.eclipse.equinox.launcher_1.6.0.v20200915-1508.jar
19896 Launcher
17628 org.eclipse.equinox.launcher_1.6.0.v20200915-1508.jar

默认开启
C:\Users\cpucode>jinfo -flag UseTLAB 12692
-XX:+UseTLAB

* */
