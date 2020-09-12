/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 14:19:23
 * @LastEditTime: 2020-09-12 14:19:54
 * @FilePath: \java\javaAPI\print_random.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI;

import java.util.Random;

public class print_random {
    public static void main(String[] args) {
        // 创建键盘录入数据的对象
        Random r = new Random();

        for(int i = 0; i < 3; i++) {
            // 随机生成一个数据
            // 范围在 0 （包括）和 指定值 n （不包括）之间的 int 值
            int number = r.nextInt(10);
            // 输出数据
            System.out.println("number:" + number);
        }
    }
}

/*
number:8
number:6
number:3
*/