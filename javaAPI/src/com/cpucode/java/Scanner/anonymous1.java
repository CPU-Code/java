/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 14:07:56
 * @LastEditTime: 2020-09-12 14:13:46
 * @FilePath: \java\javaAPI\anonymous1.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI;

import java.util.Scanner;

public class anonymous1 {
    public static void main(String[] args) {
        //普通方法

        Scanner sc = new Scanner(System.in);
        input(sc);

        // 创建匿名对象直接调用方法，没有变量名
        // 一个匿名对象，只能使用一次
        //匿名对象作为方法接收的参数
        input(new Scanner((System.in)));
    }

    public static void input(Scanner sc){
        System.out.println(sc);
    }
}

