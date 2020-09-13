/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 11:20:48
 * @LastEditTime: 2020-09-13 11:30:40
 * @FilePath: \java\javaAPI\Math\math_abs_ceil.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.Math;

public class math_abs_ceil {
    public static void main(String[] args){
        // 定义最小值
        double min = -10.8;

        // 定义最大值
        double max = 6.6;

        // 定义变量计数
        int count = 0;

        //  ceil(double a) ：返回大于等于参数的最小的整数
        // 范围内循环
        for(double i = Math.ceil(min); i <= max; i++){
            // 获取绝对值并判断
            if(Math.abs(i) > 6 || Math.abs(i) < 2.1){
                // 计数
                System.out.println("Math.abs(i) ==", Math.abs(i));
                count++;
            }
        }
        System.out.println("个数 = " + count + "个");
    }
}

/*
Math.abs(-10.0) == 10.0
Math.abs(-9.0) == 9.0
Math.abs(-8.0) == 8.0
Math.abs(-7.0) == 7.0
Math.abs(-2.0) == 2.0
Math.abs(-1.0) == 1.0
Math.abs(0.0) == 0.0
Math.abs(1.0) == 1.0
Math.abs(2.0) == 2.0
个数 = 9个
*/