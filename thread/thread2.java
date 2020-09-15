/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 10:49:12
 * @LastEditTime: 2020-09-15 10:53:07
 * @FilePath: \java\thread\thread2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package thread;

public class thread2 {
    public static void main(String[] args){
        System.out.println("这是main线程");

        MyThread mt = new MyThread("小强");

        //开启了一个新的线程
        mt.start();

        for(int i = 0; i < 3; i++){
            System.out.println("旺财" + i);
        }
    }
}

class MyThread extends Thread {

    // 利用继承中的特点 , 将线程名称传递 进行设置
    public MyThread(String name){
        super(name);
    }

    // 重写run方法, 定义线程要执行的代码
    public void run() {
        for(int i = 0; i < 3; i++){
            //getName()方法 来自父亲
            System.out.println(getName() + i);
        }
    }
}

/*
这是main线程
旺财0
旺财1
旺财2
小强0
小强1
小强2
*/