/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 17:23:31
 * @LastEditTime: 2020-09-15 17:25:09
 * @FilePath: \java\thread\thread11\Main.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.thread.thread11;

public class Main {
    public static void main(String[] args){
        //等待唤醒案例
        BaoZi bz = new BaoZi();
        ChiHuo ch = new ChiHuo("吃货",bz);
        BaoZiPu bzp = new BaoZiPu("包子铺",bz);

        ch.start();
        bzp.start();

    }
}

/*
包子开始做包子
包子好 凉皮牛肉
吃货来了了
吃货正在吃凉皮牛肉包子
包子开始做包子
包子好 剥皮杏儿
吃货来了了
吃货正在吃剥皮杏儿包子
包子开始做包子
包子好 凉皮牛肉
吃货来了了
吃货正在吃凉皮牛肉包子
包子开始做包子
*/