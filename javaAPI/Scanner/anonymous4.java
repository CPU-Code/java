/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 14:29:24
 * @LastEditTime: 2020-09-13 14:36:32
 * @FilePath: \java\javaAPI\Scanner\anonymous4.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.Scanner;

import java.util.Scanner;

public class anonymous4 {
    public static void main(String[] args){

        // 普通使用方式
        //Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();

        // 匿名对象的方式
        //int num = new Scanner(System.in).nextInt();
        //System.out.println("输入的是：" + num);

        // 使用一般写法传入参数
        //Scanner sc = new Scanner(System.in);
        //methodParam(sc);

        // 使用匿名对象来进行传参
        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入 :" + num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入是" + num);
    }

    public static Scanner methodReturn() {
        //Scanner sc = new Scanner(System.in);
        //return sc;
        return new Scanner(System.in);
    }
}

/*
2
输入是2
2
输入 :2
*/