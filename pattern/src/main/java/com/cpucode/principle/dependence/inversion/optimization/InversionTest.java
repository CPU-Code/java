package com.cpucode.principle.dependence.inversion.optimization;

/**
 * 通过抽象使各个类或者模块不相互影响，实现松耦合
 *
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 21:59
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class InversionTest {
    public static void main(String[] args) {
        //依赖注入
        Tom tom = new Tom();

        tom.study(new JavaCourse());
        tom.study(new PythonCourse());

        System.out.println("/************************************/");
        System.out.println();

        //构造器注入方式
        Tom tom2 = new Tom(new JavaCourse());
        tom2.study();

        System.out.println("/************************************/");
        System.out.println();

        // Setter 方式来注入
        Tom tom3 = new Tom();
        tom3.setCourse(new JavaCourse());
        tom3.study();

        tom3.setCourse(new PythonCourse());
        tom3.study();
    }
}
