/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 14:47:27
 * @LastEditTime: 2020-09-12 14:57:52
 * @FilePath: \java\javaAPI\ArrayList\object_array.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.ArrayList;

public class object_array {
    public static void main(String[] args) {
        //创建学生数组
        Student[] students = new Student[3];

        //创建学生对象
        Student s1 = new Student("cpucode", 22);
        Student s2 = new Student("cpu",21);

        //把学生对象作为元素赋值给学生数组
        students[0] = s1;
        students[1] = s2;

        for(int x = 0; x < students.length - 1 ; x++){
            Student s = students[x];

            System.out.println(s.getName() + "---" + s.getAge());
        }
    }

    static class Student {
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
}



/*
cpucode---22
cpu---21
*/