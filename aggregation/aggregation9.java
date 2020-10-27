/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 09:23:05
 * @LastEditTime: 2020-09-17 09:23:43
 * @FilePath: \java\aggregation\aggregation9.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.HashSet;
import java.util.Objects;

public class aggregation9 {
    public static void main(String[] args) {
        //创建集合对象 该集合中存储 Student类型对象
        HashSet<Student> stuSet = new HashSet<Student>();
        //存储
        Student stu = new Student("cpucode", 22);

        stuSet.add(stu);
        stuSet.add(new Student("cpu", 11));
        stuSet.add(new Student("hello", 32));
        stuSet.add(stu);

        for(Student stu2 : stuSet){
            System.out.println(stu2);
        }
    }

    static class Student{
        private String name;
        private int age;

        public Student(){

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

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o){
            if(this == o){
                return true;
            }

            if(o == null || getClass() != o.getClass()){
                return false;
            }

            Student student = (Student) o;

            return age == student.age && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode(){
            return Objects.hash(name, age);
        }
    }
}



/*
com.company.Student@b73a054f
com.company.Student@2eb724
com.company.Student@1e1c5ae2
*/