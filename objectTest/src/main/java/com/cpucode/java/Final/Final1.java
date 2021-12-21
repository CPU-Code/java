/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 16:12:34
 * @LastEditTime: 2020-09-14 16:15:10
 * @FilePath: \java\object\Final\Final1.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Final;

public class Final1 {
    public static void main(String[] args){
        // 声明变量，使用final修饰
        final int a;

        // 第一次赋值
        a = 10;
        // 第二次赋值
        //a = 20;     // 报错,不可重新赋值

        // 声明变量，直接赋值，使用final修饰
        final int b = 10;

        // 第二次赋值
        //b = 20;     // 报错,不可重新赋值

        System.out.println(a);
        System.out.println(b);
    }
}

/*
10
10
*/
