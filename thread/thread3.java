/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 11:01:49
 * @LastEditTime: 2020-09-15 11:07:26
 * @FilePath: \java\thread\thread3.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package thread;

public class thread3 {
    public static void main(String[] args){
        //创建自定义类对象 线程任务对象
        MyRunnable mr = new MyRunnable();

        //创建线程对象
        Thread t = new Thread(mr, "小强");

        t.start();

        for(int i = 0; i < 3; i++){
            System.out.println("旺财" + i);
        }
    }
}


class MyRunnable implements Runnable{
    // 重写该接口
    @Override
    public void run() {
        for(int i = 0; i < 4; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}