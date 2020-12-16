/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 12:57:02
 * @LastEditTime: 2020-09-15 16:00:39
 * @FilePath: \java\thread\thread9.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package thread;

public class thread9 {
    public static void main(String[] args){
        //创建线程任务对象
        MyThread ticket = new MyThread();

        //创建三个窗口对象
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        //同时卖票
        t1.start();;
        t2.start();;
        t3.start();
    }

    static class MyThread extends Thread{
        public void run() {
            for(int i = 0; i < 5; i++){
                if((i) %4 == 0){
                    System.out.println("------" + i);
                }

                System.out.println(i);

                try{
                    Thread.sleep(1000);
                    System.out.println("线程睡眠 1秒 \n");
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}



/*
------0
------0
0
------0
0
0
线程睡眠 1秒 

线程睡眠 1秒 

1
线程睡眠 1秒 

1
1
线程睡眠 1秒 

2
线程睡眠 1秒 

2
线程睡眠 1秒 

2
线程睡眠 1秒 

线程睡眠 1秒 

3
线程睡眠 1秒 

3
3
线程睡眠 1秒 

------4
4
线程睡眠 1秒 

线程睡眠 1秒 

------4
4
------4
4
线程睡眠 1秒 

线程睡眠 1秒 

线程睡眠 1秒 
*/