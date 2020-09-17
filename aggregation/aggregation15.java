/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 13:02:09
 * @LastEditTime: 2020-09-17 13:10:59
 * @FilePath: \java\aggregation\aggregation15.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.ArrayList;
import java.util.Collections;

public class aggregation15 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("cpucode", 22));
        list.add(new Student("cpu", 21));
        list.add(new Student("hello", 11));

        /*
        让学生 按照年龄排序 升序
        */
        Collections.sort(list);//要求 该list中元素类型 必须实现比较器Comparable接口

        for (Student student : list) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "String {" + "name=" + name + '\'' + ", age=" + age + '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}