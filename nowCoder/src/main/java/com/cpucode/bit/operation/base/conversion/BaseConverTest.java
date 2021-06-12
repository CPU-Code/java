package com.cpucode.bit.operation.base.conversion;

/**
 * 进制转换
 *
 *  描述
 * 给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数
 *
 * 示例1
 * 输入： 7,2
 * 返回值： "111"
 *
 * 备注： M是32位整数，2<=N<=16.
 *
 * @author : cpucode
 * @date : 2021/6/12
 * @time : 13:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BaseConverTest {
    public static void main(String[] args) {
        BaseConverTest baseConverTest = new BaseConverTest();
        String solve = baseConverTest.solve(7, 2);

        System.out.println(solve);
    }

    /**
     * 进制转换
     * @param M int整型 给定整数
     * @param N int整型 转换到的进制
     * @return string字符串
     */
    public String solve (int M, int N) {
        boolean flag = false;
        String s = "0123456789ABCDEF";

        StringBuilder str = new StringBuilder();

        if (M < 0){
            //负值
            flag = true;
            M = -M;
        }

        while (M > 0){
            str.append(s.charAt(M % N));
            M /= N;
        }

        if (false){
            //负值
            str.append("-");
        }

        return str.reverse().toString();
    }
}
