/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 15:27:18
 * @LastEditTime: 2020-09-19 15:53:17
 * @FilePath: \java\IO\io34.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

public class io34 {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建属性集对象
        Properties properties = new Properties();

        // 添加键值对元素
        properties.setProperty("cpucode", "520");
        properties.setProperty("cpu", "666");
        properties.setProperty("hello", "88");

        // 打印属性集对象
        System.out.println(properties);

        // 通过键,获取属性值
        System.out.println(properties.getProperty("cpucode"));
        System.out.println(properties.getProperty("cpu"));
        System.out.println(properties.getProperty("hello"));

        // 遍历属性集,获取所有键的集合
        Set<String> strings = properties.stringPropertyNames();

        // 打印键值对
        for (String key : strings) {
            System.out.println(key + "--" + properties.getProperty(key));
        }
    }
}

/*
{cpucode=520, cpu=666, hello=88}
520
666
88
cpucode--520
cpu--666
hello--88
*/