/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 18:11:54
 * @LastEditTime: 2020-09-15 18:13:11
 * @FilePath: \java\Lambda\lambda2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Lambda;

public class lambda2 {
    public static void main(String[] args){
        // 启动线程
        new Thread(() -> System.out.println("多线程任务运行")).start();
    }
}

/*
多线程任务运行
*/