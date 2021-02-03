package com.cpucode.java.loading.process;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * 3. 引用常量不会触发此类或接口的初始化。因为常量在链接阶段就已经被显式赋值了。
 * 4. 调用ClassLoader类的loadClass()方法加载一个类，并不是对类的主动使用，不会导致类的初始化
 *
 * @author : cpucode
 * @date : 2021/2/3
 * @time : 15:07
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PassiveUse2Test {

    @Test
    public void test1(){
        System.out.println(Person.NUM);

        /**
         * 1
         * */
    }

    @Test
    public void test2(){
        System.out.println(Person.NUM1);

        /**
         * Person类的初始化
         * -573512745
         * */
    }

    @Test
    public void test3(){
        System.out.println(SerialA.ID);

        /**
         * 1
         * */
    }

    @Test
    public void test4(){
        System.out.println(SerialA.ID1);

        /**
         * SerialA的初始化
         * 800444940
         * */
    }

    @Test
    public void test5(){
        try{
            Class clazz = ClassLoader.getSystemClassLoader().loadClass("com.cpucode.java.loading.process.Person");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

class Person{
    static {
        System.out.println("Person类的初始化");
    }

    public static final int NUM = 1;
    public static final int NUM1 = new Random().nextInt();
}

@SuppressWarnings("AlibabaAvoidManuallyCreateThread")
interface SerialA{
    public static final Thread T = new Thread(){
        {
            System.out.println("SerialA的初始化");
        }
    };

    int ID = 1;
    int ID1 = new Random().nextInt();
}