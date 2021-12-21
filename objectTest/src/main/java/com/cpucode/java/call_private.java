package com.cpucode.java;

/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-11 14:39:44
 * @LastEditTime: 2020-09-11 14:41:28
 * @FilePath: \java\object\call_private.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
public class call_private {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("cpucode"); // 设置name
        ming.setBirth(2008);

        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }

    static class Person {
        private String name;
        private int birth;

        // 方法间接修改private字段
        public String getName() {

            // 隐含的变量 this，它始终指向当前实例
            return this.name;
        }

        public void setName(String name) {

            // 不允许传入null和空字符串
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("invalid name");
            }

            // 前面的this不可少，少了就变成局部变量name了
            this.name = name;
        }

        public int getAge() {

            // 方法可以封装一个类的对外接口
            return calcAge(2020); // 调用private方法
        }

        public void setBirth(int birth) {
            this.birth = birth;
        }

        // private方法: 内部方法是, 不允许外部调用
        private int calcAge(int currentYear) {
            return currentYear - this.birth;
        }
    }
}



/*
cpucode
12
*/