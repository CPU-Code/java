/**
 * User: cpucode
 * Date: 2021/1/7
 * Time: 15:36
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.method.area;

/**
 *  测试设置方法区大小参数的默认值
 *
 *  jdk7及以前：
 *  -XX:PermSize=100m -XX:MaxPermSize=100m
 *
 *  jdk8及以后：
 *  -XX:MetaspaceSize=100m -XX:MaxMetaspaceSize=100m
 */

public class MethodAreaSize {
    public static void main(String[] args) {
        System.out.println("start......");

        try{
            Thread.sleep(10000000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("end........");
    }
}

/*

C:\Users\cpucode>jps
14192 Jps
14704 Launcher
10228
14148 MethodAreaSize
8188 org.eclipse.equinox.launcher_1.6.0.v20200915-1508.jar

C:\Users\cpucode>jinfo -flag MetaspaceSize 14148
-XX:MetaspaceSize=104857600         =100M

C:\Users\cpucode>jinfo -flag MaxMetaspaceSize 14148
-XX:MaxMetaspaceSize=104857600      =100M

* */