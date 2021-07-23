/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 16:03:18
 * @LastEditTime: 2020-09-15 16:39:45
 * @FilePath: \java\thread\thread10.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.thread;

public class thread10 {
    public static Object obj = new Object();

    public static void main(String[] args){
        
        new Thread(new Runnable(){
            @Override
            public void run() {
                while(true) {
                    synchronized (obj){
                        try{
                            System.out.println(Thread.currentThread().getName() + " == 获取锁对象, 调用wait方法, 进入waitting 状态, 释放对象");
                            obj.wait();     //无限等待

                            //obj.wait(5000); //计时等待, 5秒 时间到，自动醒来
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }

                        System.out.println(Thread.currentThread().getName() + "=== 从waiting状 态醒来，获取到锁对象，继续执行了");
                    }
                }
            }
        }, "等待线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //while(true){      //每隔3秒 唤醒一次

                    try {
                        System.out.println(Thread.currentThread().getName() + "-------等待3秒");
                        Thread.sleep(3000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    synchronized (obj){
                        System.out.println(Thread.currentThread().getName() + "----获取锁对象, 调用notify方法, 释放对象");
                        obj.notify();
                    }

                //}
                
            }
        }, "唤醒线程").start();
    }
}

/*
唤醒线程-------等待3秒
等待线程 == 获取锁对象, 调用wait方法, 进入waitting 状态, 释放对象
唤醒线程----获取锁对象, 调用notify方法, 释放对象
等待线程=== 从waiting状 态醒来，获取到锁对象，继续执行了
等待线程 == 获取锁对象, 调用wait方法, 进入waitting 状态, 释放对象
*/