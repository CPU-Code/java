/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 21:41:11
 * @LastEditTime: 2020-09-15 21:41:53
 * @FilePath: \java\javaAPI\date\date5.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class date5 {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入出生日期 格式 YYYY-MM-dd");

        String birthdayString = new Scanner(System.in).next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date birthdayDate = sdf.parse(birthdayString);

        Date todayDate = new Date();

        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = todayDate.getTime();
        long second = todaySecond-birthdaySecond;

        if(second < 0){
            System.out.println("没有出生");
        } else {
            System.out.println(second/1000/60/60/24);
        }
    }
}

/*
请输入出生日期 格式 YYYY-MM-dd
1222-11-20
291391
*/