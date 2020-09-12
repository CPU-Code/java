/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 22:29:45
 * @LastEditTime: 2020-09-12 22:38:27
 * @FilePath: \java\javaAPI\static\class_variable.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.Static;

public class class_variable {
    public static void main(String[] args){
        Student s1 = new Student("cpucode", 22);
        Student s2 = new Student("cpu", 21);

        s1.show();
        s2.show();
    }
}

class Student {
    private String name;
    private int age;

    // 学生的id
    private int sid;
    // 类变量，记录学生数量，分配学号
    public static int numberOfStudent = 0;

    public Student(String name , int age){
        this.name = name;
        this.age = age;
        // 通过 numberOfStudent 给学生分配学号
        this.sid = ++numberOfStudent;
    }

    // 打印属性值
    public void show(){
        System.out.println("Student: name = " + name + ", age = " + age + ", sid = " + sid);
    }
}

/*
Student: name = cpucode, age = 22, sid = 1
Student: name = cpu, age = 21, sid = 2
*/