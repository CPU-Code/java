/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 09:34:53
 * @LastEditTime: 2020-09-16 09:36:55
 * @FilePath: \java\javaAPI\system\system2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.system;

public class system2 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        for(int i = 0; i < 1000000; i++){
        }

        long end = System.currentTimeMillis();

        //获取当前时间毫秒值
        System.out.println("共耗时毫秒：" + (end - start));
    }
}

/*
共耗时毫秒：2
*/