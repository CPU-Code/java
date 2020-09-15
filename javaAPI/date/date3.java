/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 21:16:28
 * @LastEditTime: 2020-09-15 21:19:00
 * @FilePath: \java\javaAPI\date\date3.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date3 {
    //  把Date对象转换成String
    public static void main(String[] args){
        Date date = new Date();
        // 创建日期格式化对象,在获取格式化对象时可以指定风格
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");

        // 将Date对象格式化为字符串
        String str = df.format(date);
        System.out.println(str);
    }
}

/*
2020年09月15日
*/