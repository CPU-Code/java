/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-11 15:24:22
 * @LastEditTime: 2020-09-11 15:26:15
 * @FilePath: \java\object\multiple_construction.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
public class multiple_construction {
    public static void main(String[] args) {
        Person p1 = new Person("cpucode", 25); // 既可以调用带参数的构造方法
        Person p2 = new Person(); // 也可以调用无参数构造方法

    }

    static class Person {
        private String name;    // 默认初始化为null
        private int age;        // 默认初始化为0

        //使用带参数的构造方法，又想保留不带参数的构造方法，那么只能把两个构造方法都定义出来

        public Person() {
        }

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

