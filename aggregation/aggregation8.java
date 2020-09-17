/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 09:05:47
 * @LastEditTime: 2020-09-17 09:06:59
 * @FilePath: \java\aggregation\aggregation8.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.HashSet;

public class aggregation8 {
    public static void main(String[] args) {
        //创建 Set集合
        HashSet<String> set = new HashSet<String>();

        //添加元素
        set.add(new String("cpucode"));
        set.add("cpu");
        set.add("cpucode");

        //遍历
        for (String name : set){
            System.out.println(name);
        }
    }
}

/*
cpucode
cpu
*/