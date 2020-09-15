/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 21:09:57
 * @LastEditTime: 2020-09-15 21:10:24
 * @FilePath: \java\javaAPI\date\date1.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.date;

public class date1 {
    public static void main(String[] args){
        // 创建日期对象，把当前的时间
        System.out.println(new Date());
        // 创建日期对象，把当前的毫秒值转成日期对象
        System.out.println(new Date(0l));
    }
}

/*
Tue Sep 15 21:09:13 CST 2020
Thu Jan 01 08:00:00 CST 1970
*/