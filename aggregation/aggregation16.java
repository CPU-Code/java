/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 13:33:48
 * @LastEditTime: 2020-09-17 13:37:05
 * @FilePath: \java\aggregation\aggregation16.JAVA
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.HashMap;

public class aggregation16 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("cpucode", "1");
        map.put("cpu", "2");
        map.put("hello", "3");

        System.out.println(map);

        System.out.println(map.remove("hello"));
        System.out.println(map);

        System.out.println(map.get("cpucode"));
        System.out.println(map.get("cpu"));
    }
}

/*
{cpucode=1, cpu=2, hello=3}
3
{cpucode=1, cpu=2}
1
2
*/