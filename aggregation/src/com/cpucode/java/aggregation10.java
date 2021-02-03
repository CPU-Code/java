/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 09:34:58
 * @LastEditTime: 2020-09-17 09:35:40
 * @FilePath: \java\aggregation\aggregation10.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class aggregation10 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();

        set.add("cpucode");
        set.add("cpu");
        set.add("hello");

        Iterator<String> it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

/*
cpucode
cpu
hello
*/