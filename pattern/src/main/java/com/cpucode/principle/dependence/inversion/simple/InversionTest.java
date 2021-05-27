package com.cpucode.principle.dependence.inversion.simple;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:02
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class InversionTest {
    public static void main(String[] args) {
        Tom tom = new Tom();

        tom.studyJavaCourse();
        tom.studyPythonCourse();
    }
}
