/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 21:08:13
 * @LastEditTime: 2020-09-13 21:11:31
 * @FilePath: \java\object\Interface\InterfaceDemo4.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Interface;

public class InterfaceDemo4 {
    public static void main(String[] args){
        // 静态与.class 文件相关，只能使用接口名调用，不可以通过实现类的类名或者实现类的对象调用
        
        // Animal.run(); // 【错误】无法继承方法,也无法调用
        LiveAble.run();
    }

    interface LiveAble{
        public static void run(){
            System.out.println("cpucode");
        }
    }

    class Animal implements LiveAble{
        //无法重写静态方法
    }
}




/*
cpucode
*/