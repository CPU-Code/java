/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 12:48:26
 * @LastEditTime: 2020-09-17 12:49:22
 * @FilePath: \java\aggregation\aggregation12.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.ArrayList;
import java.util.Collections;

public class aggregation12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //原来写法
        //list.add(12);
        //list.add(14);
        //list.add(15);
        //list.add(1000);

        //采用工具类 完成 往集合中添加元素
        Collections.addAll(list, 5, 22, 1, 2);
        System.out.println(list);
        //排序方法
        Collections.sort(list);
        System.out.println(list);
    }
}

/*
[5, 22, 1, 2]
[1, 2, 5, 22]
*/