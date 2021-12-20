package com.cpucode.generics.box;

/**
 * 定义一个泛型类
 *
 * @author : cpucode
 * @date : 2021/12/20 14:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.setT(new Integer(10));
        stringBox.setT(new String("cpuCode"));

        System.out.printf("整型值为 :%d\n\n", integerBox.getT());
        System.out.printf("字符串为 :%s\n", stringBox.getT());
    }

    static class Box<T> {
        private T t;

        public void setT(T t) {
            this.t = t;
        }

        public T getT() {
            return t;
        }
    }
}

