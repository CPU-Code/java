/**
 * User: cpucode
 * Date: 2021/1/7
 * Time: 16:57
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.methodArea;

//查看方法区的内部构成

import java.io.Serializable;

public class MethodInnerStrucTest extends Object implements Comparable<String>, Serializable {
    //属性
    public int num = 10;
    private static String str = "我是cpucode";

    //构造器

    //方法
    public void test1(){
        int count = 20;

        System.out.println("count = " + count);
    }

    public static int test2(int cal){
        int result = 0;

        try{
            int value = 30;

            result = value/cal;
        } catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public int compareTo(String o){
        return 0;
    }
    public static void main(String[] args) {
        MethodInnerStrucTest methodInnerStrucTest = new MethodInnerStrucTest();

        methodInnerStrucTest.test1();

        test2(10);

    }
}
