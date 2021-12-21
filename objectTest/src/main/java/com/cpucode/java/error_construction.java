package com.cpucode.java;

/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-11 15:21:18
 * @LastEditTime: 2020-09-11 15:21:49
 * @FilePath: \java\object\error_construction.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
public class error_construction {


    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person() {

        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {
        // 自定义了一个构造方法，那么，编译器就不再自动创建默认构造方法
        Person p = new Person(); // 编译错误:找不到这个构造方法
    }
}

