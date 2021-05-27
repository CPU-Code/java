package com.cpucode.principle.dependence.inversion;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 19:25
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Tom2 {
    private Course course;

    public Tom2(){}

    public Tom2(Course course){
        this.course = course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void study(Course course){
        course.study();
    }

    public void study(){
        this.course.study();
    }

    public static void main(String[] args) {
        //依赖注入
        Tom2 tom = new Tom2();

        tom.study(new JavaCourse());
        tom.study(new PythonCourse());

        System.out.println("/************************************/");
        System.out.println();

        //构造器注入方式
        Tom2 tom2 = new Tom2(new JavaCourse());
        tom2.study();

        System.out.println("/************************************/");
        System.out.println();

        // Setter 方式来注入
        Tom2 tom3 = new Tom2();
        tom3.setCourse(new JavaCourse());
        tom3.study();

        tom3.setCourse(new PythonCourse());
        tom3.study();
    }

}
