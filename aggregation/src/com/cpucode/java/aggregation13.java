/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 12:50:49
 * @LastEditTime: 2020-09-17 12:52:58
 * @FilePath: \java\aggregation\aggregation13.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.ArrayList;
import java.util.Collections;

public class aggregation13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("cpucode");
        list.add("cpu");

        Collections.sort(list);
        System.out.println(list);
    }
}

/*
[cpu, cpucode]
*/