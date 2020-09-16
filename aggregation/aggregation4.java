/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 17:35:21
 * @LastEditTime: 2020-09-16 17:38:47
 * @FilePath: \java\aggregation\aggregation4.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.ArrayList;
import java.util.Collection;

public class aggregation4 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("cpucode");
        coll.add("cpu");

        //使用增强for遍历
        for(String s : coll){
            //接收变量s代表 代表被遍历到的集合元素
            System.out.println(s);
        }
    }
}

/*
cpucode
cpu
*/