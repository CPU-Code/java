/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-20 17:48:50
 * @LastEditTime: 2020-09-20 17:56:56
 * @FilePath: \java\IO\io46.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class io46 {
    public static void main(String[] args) throws IOException {
        Employee e = new Employee();
        e.name = "cpucode";
        e.address = "changsha";
        e.age = 21;

        try {
            // 创建序列化流对象
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cpucode_out.txt"));
            // 写出对象
            out.writeObject(e);
            // 释放资源
            out.close();
            System.out.println("");
        } catch (IOException i) {
            i.printStackTrace();
        }

        e.addressCheck();
    }
}

class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public  transient int age;

    public void addressCheck() {
        System.out.println("Address check :" + name + " -- " + address);
    }
}