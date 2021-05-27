package com.cpucode.pattern.factory.simplefactory;

import com.cpucode.pattern.factory.Course;
import com.cpucode.pattern.factory.JavaCourse;
import com.cpucode.pattern.factory.PythonCourse;

/**
 * 由一个工厂对象决定创建出哪一种产品类的实例，但它不属于 GOF
 *
 * 缺点：
 *   工厂类的职责相对过重，不易于扩展过于复杂的产品结构
 *
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 21:13
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //父类 Course 指向子类 JavaCourse 的引用，应用层代码需要依赖 JavaCourse
        Course course = new JavaCourse();
        course.record();

        System.out.println("/*******************************/");
        System.out.println();


        CourseFactory factory = new CourseFactory();
        factory.create("python");

        System.out.println("/*******************************/");
        System.out.println();


        Course course2 = factory.create2("com.cpucode.pattern.factory.JavaCourse");
        course2.record();

        System.out.println("/*******************************/");
        System.out.println();


        Course course3 = factory.create(PythonCourse.class);
        course3.record();
    }
}
