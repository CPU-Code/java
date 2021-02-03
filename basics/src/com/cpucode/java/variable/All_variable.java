package com.cpucode.java.variable;

/*
变量使用的注意事项：
    名字不能重复
    变量未赋值，不能使用
    long类型的变量定义的时候，为了防止整数过大，后面要加L
    float类型的变量定义的时候，为了防止类型不兼容，后面要加F
*/

public class All_variable {
    public static void main(String[] args){
        //定义byte类型的变量
        byte b = 10;
        System.out.println("byte b = " + b);

        //定义short类型的变量
        short s = 100;
        System.out.println("short s = " + s);

        //定义int类型的变量
        int i = 1000;
        System.out.println("int i = " + i);

        long l = 1000000L;
        System.out.println("long l = " + l);

        System.out.println("--------------");

        //定义float类型的变量
        float f = 13.14F;
        System.out.println("float f = " + f);

        //定义double类型的变量
        double d = 13.14;
        System.out.println("double d = " + d);

        System.out.println("--------------");

        //定义char类型的变量
        char c = 'a';
        System.out.println("char c = " + c);

        System.out.println("--------------");

        //定义boolean类型的变量
        boolean bb = true;
        System.out.println("boolean bb = " + b);

    }
}

/*

byte b = 10
short s = 100
int i = 1000
long l = 1000000
--------------
float f = 13.14
double d = 13.14
--------------
char c = a
--------------
boolean bb = 10

*/