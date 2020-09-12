/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 17:19:17
 * @LastEditTime: 2020-09-12 18:18:54
 * @FilePath: \java\javaAPI\ArrayList\ArrayList_object.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.ArrayList;

import java.util.ArrayList;

public class ArrayList_object {
    public static void main(String[] args){
        //创建集合对象
        ArrayList<Student> list = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("cpucode", 20);
        Student s2 = new Student("cpu", 21);

        //把学生对象作为元素添加到集合中
        list.add(s1);
        list.add(s2);

        //遍历集合
        for(int x = 0; x < list.size(); x++){
            Student s = list.get(x);

            System.out.println(s.getName() + "---" + s.getAge());;
        }
    }
}

class Student {
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

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}


/*
cpucode---20
cpu---21
*/