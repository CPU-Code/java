/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 11:09:40
 * @LastEditTime: 2020-09-15 11:12:53
 * @FilePath: \java\thread\thread4.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.thread;

public class thread4 {
    public static void main(String[] args){

        // new Runnable(){
        // public void run(){
        // for (int i = 0; i < 3; i++) {
        // System.out.println("cpucode:"+i);
        // }
        // }
        // }; //‐‐‐这个整体 相当于new MyRunnable()

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 4; i++){
                    System.out.println("cpucode" + i);
                }
            }
        };

        new Thread(r).start();

        for(int i = 0; i < 3; i++){
            System.out.println("cpu" + i);
        }
    }
}

/*
cpucode0
cpu0
cpucode1
cpu1
cpucode2
cpu2
cpucode3
*/