package com.cpucode.pattern.factory.abstractfactory;

import com.cpucode.pattern.factory.abstractfactory.java.JavaCourseFactory;
import com.cpucode.pattern.factory.abstractfactory.python.PythonCourseFactory;

/**
 * 抽象工厂模式（Abstract Factory Pattern）:
 *   提供一个创建一系列相关或相互依赖对象的接口，无须指定他们具体的类
 *
 * 抽象工厂缺点：
 * 1、规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口。
 * 2、增加了系统的抽象性和理解难度
 *
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();

        System.out.println("/******************************************/");
        System.out.println();

        factory = new PythonCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();
    }
}
