/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 17:24:27
 * @LastEditTime: 2020-09-15 17:24:47
 * @FilePath: \java\thread\thread11\BaoZiPu.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package thread.thread11;

public class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(String name, BaoZi bz){
        super(name);
        this.bz = bz;
    }

    @Override
    public void run(){
        int count = 0;

        //造包子
        while(true){
            //同步
            synchronized (bz){
                if(bz.flag == true){
                    // //包子资源 存在
                    try{
                        bz.wait();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                // 没有包子 造包子
                System.out.println("包子开始做包子");
                if(count %2 == 0){
                    bz.pier = "凉皮";
                    bz.xianer = "牛肉";
                } else {
                    bz.pier = "剥皮";
                    bz.xianer = "杏儿";
                }

                count++;

                bz.flag = true;
                System.out.println("包子好 " + bz.pier + bz.xianer);
                System.out.println("吃货来了了");

                //唤醒等待线程 （吃货）
                bz.notify();
            }
        }
    }
}
