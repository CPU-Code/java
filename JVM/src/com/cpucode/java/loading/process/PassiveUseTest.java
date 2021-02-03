package com.cpucode.java.loading.process;

import org.junit.jupiter.api.Test;

/**
 * 关于类的被动使用，即不会进行类的初始化操作，即不会调用<clinit>()
 *
 * 1. 当访问一个静态字段时，只有真正声明这个字段的类才会被初始化。
 *      当通过子类引用父类的静态变量，不会导致子类初始化
 * 2. 通过数组定义类引用，不会触发此类的初始化
 *
 * 说明：没有初始化的类，不意味着没有加载！
 *
 * @author : cpucode
 * @date : 2021/2/3
 * @time : 14:59
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PassiveUseTest {

    @Test
    public void test1(){
        System.out.println(Child.num);

        /**
         * Parent的初始化过程
         * 1
         * */
    }

    @Test
    public void test2(){
        Parent[] parents= new Parent[5];

        System.out.println(parents.getClass());
        System.out.println(parents.getClass().getSuperclass());

        /**
         * class [Lcom.cpucode.java.loading.process.Parent;
         * class java.lang.Object
         * */
    }

    @Test
    public void test3(){
        Parent[] parents = new Parent[10];

        parents[0] = new Parent();

        /**
         * Parent的初始化过程
         * */
    }

    @Test
    public void test4(){
        Parent[] parents = new Parent[10];

        parents[0] = new Parent();
        parents[1] = new Parent();

        /**
         * Parent的初始化过程
         * */
    }

}


class Parent{
    static {
        System.out.println("Parent的初始化过程");
    }

    public static int num = 1;
}

class Child extends Parent{
    static {
        System.out.println("Child的初始化过程");
    }
}