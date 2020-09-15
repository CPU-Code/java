/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 11:25:19
 * @LastEditTime: 2020-09-15 11:32:15
 * @FilePath: \java\thread\thread5.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package thread;

public class thread5 {
    public static void main(String[] args){
        //创建线程任务对象
        Ticket ticket = new Ticket();

        // 几个窗口(线程)票数不同步了，这种问题称为线程不安全
        
        //创建三个窗口对象
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        //同时卖票
        t1.start();;
        t2.start();;
        t3.start();
    }
}

class Ticket implements Runnable {
    private int ticket = 10;

    // 执行卖票操作
    @Override
    public void run() {
        //每个窗口卖票的操作
        //窗口 永远开启
        while(true) {
            if(ticket > 0){
                //有票 可以卖
                //出票操作
                //使用sleep模拟一下出票时间
                try{
                    Thread.sleep(100);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }

                //获取当前线程对象的名字
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖 " + ticket--);
            }
        }
    }
}

/*
窗口3正在卖 9
窗口1正在卖 10
窗口2正在卖 10
窗口3正在卖 8
窗口1正在卖 7
窗口2正在卖 7
窗口3正在卖 6
窗口2正在卖 5
窗口1正在卖 4
窗口3正在卖 3
窗口2正在卖 2
窗口1正在卖 1
窗口3正在卖 0
*/