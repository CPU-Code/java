package com.cpucode.java.loading.process;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * 3. 当使用类、接口的静态字段时(final修饰特殊考虑)，
 *      比如，使用 getstatic 或者 putstatic 指令。（对应访问变量、赋值变量操作）
 * @author : cpucode
 * @date : 2021/2/2
 * @time : 22:20
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ActiveUse2Test {

    @Test
    public void test1(){
        System.out.println(User.NUM);

        /**
         * User类的初始化过程
         * 1
         * */
    }

    @Test
    public void test2(){
        System.out.println(User.NUM1);

        /**
         * 3
         * */
    }

    @Test
    public void test3(){
        System.out.println(User.NUM2);

        /**
         * User类的初始化过程
         * 6
         * */
    }

    @Test
    public void test4(){
        System.out.println(CompareA.NUM1);

        /**
         * 2
         * */
    }

    @Test
    public void test5(){
        System.out.println(CompareA.NUM2);

        /**
         * CompareA的初始化
         * 2
         * */
    }
}

class User{
    static {
        System.out.println("User类的初始化过程");
    }

    public static int NUM = 1;
    public static final int NUM1 = 3;
    public static final int NUM2 = new Random().nextInt(10);
}

@SuppressWarnings("AlibabaAvoidManuallyCreateThread")
interface CompareA{
    public static final Thread T = new Thread(){
        {
            System.out.println("CompareA的初始化");
        }
    };

    public static final int NUM1 = 2;
    public static final int NUM2 = new Random().nextInt(10);


}