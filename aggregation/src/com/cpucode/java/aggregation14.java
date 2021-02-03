/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 12:54:31
 * @LastEditTime: 2020-09-17 12:59:02
 * @FilePath: \java\aggregation\aggregation14.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class aggregation14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("cpucode");
        list.add("cpu");
        list.add("hello");

        //排序方法 按照第一个单词的降序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);
            }
        });

        System.out.println(list);
    }
}

/*
[hello, cpucode, cpu]
*/