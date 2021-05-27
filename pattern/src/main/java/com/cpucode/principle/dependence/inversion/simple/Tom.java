package com.cpucode.principle.dependence.inversion.simple;

/**
 * 依赖倒置原则（Dependence Inversion Principle,DIP）:
 *  指设计代码结构时，高层模块不应该依赖底层模块，二者都应该依赖其抽象。
 *  抽象不应该依赖细节；细节应该依赖抽象。
 *  通过依赖倒置，可以减少类与类之间的耦合性，提高系统的稳定性，
 *  提高代码的可读性和可维护性，并能够降低修改程序所造成的风险。
 *
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 19:21
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Tom {
    public void studyJavaCourse(){
        System.out.println("Tom 在学习 Java 的课程");
    }

    public void studyPythonCourse(){
        System.out.println("Tom 在学习 Python 的课程");
    }

}
