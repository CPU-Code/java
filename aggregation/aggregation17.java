/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 13:44:31
 * @LastEditTime: 2020-09-17 13:47:38
 * @FilePath: \java\aggregation\aggregation17.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.HashMap;
import java.util.Set;

public class aggregation17 {
    public static void main(String[] args) {
        //创建Map集合对象
        HashMap<String, String> map = new HashMap<String, String>();

        //添加元素到集合
        map.put("cpucode", "1");
        map.put("cpu", "2");
        map.put("hello", "3");

        System.out.println(map);

        //获取所有的键 获取键集
        Set<String> keys = map.keySet();

        // 遍历键集 得到 每一个键
        for (String key : keys){
            //key 就是键
            //获取对应值
            String value = map.get(key);
            System.out.println(key + "的值 :" + value);
        }
    }
}

/*
{cpucode=1, cpu=2, hello=3}
cpucode的值 :1
cpu的值 :2
hello的值 :3
*/