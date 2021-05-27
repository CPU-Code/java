package com.cpucode.pattern.factory.factorymethod;

import com.cpucode.pattern.factory.Course;

/**
 * 定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行
 *
 * 工厂方法适用于以下场景：
 *   1、创建对象需要大量重复的代码。
 *   2、客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。
 *   3、一个类通过其子类来指定创建哪个对象。
 * 缺点：
 *   1、类的个数容易过多，增加复杂度。
 *   2、增加了系统的抽象性和理解难度。
 *
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:21
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        CourseFactory factory = new PythonCourseFactory();
        Course course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();
    }
}
