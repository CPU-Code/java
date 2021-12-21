package com.cpucode.java;

/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-11 15:17:47
 * @LastEditTime: 2020-09-11 15:21:03
 * @FilePath: \java\object\construction_method.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
public class construction_method {
    public static void main(String[] args) {

        // 构造方法来初始化实例
        Person p = new Person("cpucode", 21);
        
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }
    }
}



/*
cpucode
21
*/