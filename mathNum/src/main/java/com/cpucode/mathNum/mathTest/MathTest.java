package com.cpucode.mathNum.mathTest;

/**
 *  static 形式，通过 Math 类可以在主函数中直接调用
 *
 * @author : cpucode
 * @date : 2021/12/21 8:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MathTest {
    public static void main(String[] args) {
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI / 2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI / 3));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));

        System.out.println(Math.PI);
    }
}
