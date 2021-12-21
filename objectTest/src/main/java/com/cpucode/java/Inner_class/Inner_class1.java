/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 17:50:15
 * @LastEditTime: 2020-09-14 18:06:42
 * @FilePath: \java\object\Inner_class\Inner_class1.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Inner_class;

public class Inner_class1 {
    public static void main(String[] args) {
        // 创建外部类对象
        Person p = new Person();

        // 创建内部类对象
        Person.Heart heart = p.new Heart();

        // 调用内部类方法
        heart.jump();

        // 调用外部类方法
        p.setLive(false);

        // 调用内部类方法
        heart.jump();
    }

    static class Person{
        private boolean live = true;

        class Heart{
            public void jump(){

                // 直接访问外部类成员
                if(live) {
                    System.out.println("心跳");
                } else{
                    System.out.println("心跳不跳");
                }
            }
        }

        public boolean isLive() {
            return live;
        }

        public void setLive(boolean live){
            this.live = live;
        }
    }
}

