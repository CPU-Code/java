package com.cpucode.pattern.factory.simplefactory;

import com.cpucode.pattern.factory.Course;
import com.cpucode.pattern.factory.JavaCourse;
import com.cpucode.pattern.factory.PythonCourse;

/**
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
