/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-18 11:25:01
 * @LastEditTime: 2020-09-18 11:25:19
 * @FilePath: \java\IO\io7.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

public class io7 {
    public static void main(String[] args) {
        //计算1~num的和，使用递归完成
        int num = 5;

        // 调用求和的方法
        int sum = getSum(num);

        // 输出结果
        System.out.println(sum);
    }

    //通过递归算法实现.
    //参数列表:int
    //返回值类型: int
    public static int getSum(int num) {
        // num为1时,方法返回1,
        //相当于是方法的出口,num总有是1的情况
        if(num == 1) {
            return 1;
        }

        // num不为1时,方法返回 num +(num‐1)的累和
        //递归调用getSum方法
        return num + getSum(num - 1);
    }
}
