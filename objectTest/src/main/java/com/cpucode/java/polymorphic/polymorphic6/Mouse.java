/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 14:01:19
 * @LastEditTime: 2020-09-14 14:01:26
 * @FilePath: \java\object\polymorphic\polymorphic6\Mouse.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.polymorphic.polymorphic6;

public class Mouse implements Use{

    @Override
    public void open() {
        System.out.println("鼠标开启, 红灯闪");
    }

    public void close() {
        System.out.println("鼠标关闭, 红灯灭");
    }

    public void click() {
        System.out.println("鼠标单击");
    }
}
