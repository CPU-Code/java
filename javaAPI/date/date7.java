/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 09:01:05
 * @LastEditTime: 2020-09-16 09:01:22
 * @FilePath: \java\javaAPI\date\date7.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.date;

import java.util.Calendar;

public class date7 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MARCH) + 1;

        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");
    }
}
