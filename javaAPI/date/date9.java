/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 09:07:57
 * @LastEditTime: 2020-09-16 09:13:44
 * @FilePath: \java\javaAPI\date\date9.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.date;

import java.util.Calendar;

public class date9 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        // 设置年
        int year = cal.get(Calendar.YEAR);
        // 设置月
        int month = cal.get(Calendar.MONTH) + 1;
        // 设置日
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);


        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        cal.add(Calendar.DAY_OF_MONTH, 2);
        cal.add(Calendar.YEAR, -3);

        // 设置年
        year = cal.get(Calendar.YEAR);
        // 设置月
        month = cal.get(Calendar.MONTH) + 1;
        // 设置日
        dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "年" + month + "月" + dayOfMonth + '日');
    }
}

/*
2020年9月16日
2017年9月18日
*/