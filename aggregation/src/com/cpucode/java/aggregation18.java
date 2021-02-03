/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 15:58:33
 * @LastEditTime: 2020-09-17 16:06:23
 * @FilePath: \java\aggregation\aggregation18.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class aggregation18 {
    public static void main(String[] args) {
        // 创建Map集合对象
        HashMap<String, String> map = new HashMap<String, String>();

        // 添加元素到集合
        map.put("cpucode", "1");
        map.put("cpu", "2");
        map.put("hello", "3");

        // 获取 所有的 entry对象 entrySet
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        // 遍历得到每一个entry对象
        for (Map.Entry<String, String> entry : entrySet){
            // 解析
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + "值是 :" + value);
        }
    }
}

/*
cpucode值是 :1
cpu值是 :2
hello值是 :3
*/