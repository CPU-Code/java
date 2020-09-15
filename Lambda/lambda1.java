/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 18:07:58
 * @LastEditTime: 2020-09-15 18:09:26
 * @FilePath: \java\Lambda\lambda1.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Lambda;

public class lambda1 {
    public static void main(String[] args){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                // 覆盖重写抽象方法
                System.out.println("多线程任务执行！");
            }
        };

        new Thread(task).start(); // 启动线程
    }
}

/*
多线程任务执行！
*/