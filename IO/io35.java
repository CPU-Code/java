/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 15:54:05
 * @LastEditTime: 2020-09-19 15:59:31
 * @FilePath: \java\IO\io35.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class io35 {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建属性集对象
        Properties pro = new Properties();
        
        try {
            // 加载文本中信息到属性集
            pro.load( new FileInputStream("cpucode.txt"));
        } catch (IOException e){
            e.printStackTrace();
        }

        // 遍历集合并打印
        Set<String> strings = pro.stringPropertyNames();

        for (String key : strings) {
            System.out.println(key + "--" + pro.getProperty(key));
        }
    }
}

/*
cpucodeå¥½--
*/