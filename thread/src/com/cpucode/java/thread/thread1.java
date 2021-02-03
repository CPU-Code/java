/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 10:34:47
 * @LastEditTime: 2020-09-15 10:40:10
 * @FilePath: \java\thread\thread1.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.thread;

public class thread1 {
    public static void main(String[] args) {
        //创建自定义线程对象
        MyThread mt = new MyThread("新线程");

        //开启新线程
        mt.start();

        //在主方法中执行for循环
        for(int i = 0; i < 3; i++){
            System.out.println("main 线程" + i);
        }
    }
}

//自定义线程类
class MyThread extends Thread {
    //定义指定线程名称的构造方法
    public MyThread(String name){
        //调用父类的String参数的构造方法，指定线程的名称
        super(name);
    }

    // 重写run方法，完成该线程执行的逻辑
    @Override
    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println(getName() + ":正在运行" + i);
        }
    }
}

/*
main 线程0
main 线程1
main 线程2
新线程:正在运行0
新线程:正在运行1
新线程:正在运行2
*/