package com.cpucode.java.simple;

/**
 * @author : cpucode
 * @Date : 2021/1/23
 * @Time : 14:13
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Jz48 {
    public int Add(int num1,int num2) {
        int result = 0;
        int carray = 0;

        do{
            //非进位加法
            result = num1 ^ num2;
            //进位
            carray = (num1 & num2) << 1;

            num1 = result;
            num2 = carray;
        }while(carray != 0);

        return result;
    }
}
