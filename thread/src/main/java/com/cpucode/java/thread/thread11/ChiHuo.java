/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 17:23:47
 * @LastEditTime: 2020-09-15 17:24:02
 * @FilePath: \java\thread\thread11\ChiHuo.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.thread.thread11;

public class ChiHuo extends Thread{
    private BaoZi bz;

    public ChiHuo(String name, BaoZi bz){
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true){
            synchronized (bz) {
                if(bz.flag == false){
                    try{
                        bz.wait();
                    } catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }

                System.out.println("吃货正在吃" + bz.pier + bz.xianer + "包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
