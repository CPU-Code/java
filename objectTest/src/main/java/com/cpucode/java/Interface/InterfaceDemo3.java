/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 20:49:08
 * @LastEditTime: 2020-09-13 21:07:17
 * @FilePath: \java\object\Interface\InterfaceDemo3.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Interface;

public class InterfaceDemo3 {
    public static void mian(String[] args){
        Animal a = new Animal();

        a.fly();
    }

    interface LiveAble{
        public default void fly(){
            System.out.println("飞飞呀");
        }
    }

    static class Animal implements LiveAble{
        @Override
        public void fly(){
            System.out.println("cpucode");
        }
    }

}


/*
cpucode
*/