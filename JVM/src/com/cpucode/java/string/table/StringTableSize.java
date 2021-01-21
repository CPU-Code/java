/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 10:50
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.string.table;

/*
* 测试StringTableSize参数
* -XX:StringTableSize=1000
*
* -XX:StringTableSize=1009
* */
public class StringTableSize {
    public static void main(String[] args) {
        System.out.println("我是cpucode");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

/*

默认状态, 打开 cmd
C:\Users\cpucode>jps
17776 Jps
8864 Launcher
10504 StringTableSize
16008 org.eclipse.equinox.launcher_1.6.0.v20200915-1508.jar
8220

C:\Users\cpucode>jinfo -flag StringTableSize 10504
-XX:StringTableSize=60013


-XX:StringTableSize=1000

Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.
StringTable size of 1000 is invalid; must be between 1009 and 2305843009213693951

-XX:StringTableSize=1009

C:\Users\cpucode>jps
4596 StringTableSize
16008 org.eclipse.equinox.launcher_1.6.0.v20200915-1508.jar
19480 Launcher
13612 Jps
8220

C:\Users\cpucode>jinfo -flag StringTableSize 4596
-XX:StringTableSize=1009

* */