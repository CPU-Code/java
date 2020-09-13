/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 14:19:23
 * @LastEditTime: 2020-09-13 14:44:11
 * @FilePath: \java\javaAPI\Random\print_random.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.Random;

import java.util.Random;

/*
Random类用来生成随机数字。使用起来也是三个步骤：

1. 导包
import java.util.Random;

2. 创建
Random r = new Random(); // 小括号当中留空即可

3. 使用
获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
实际上代表的含义是：[0,3)，也就是0~2
 */

public class print_random {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();

        System.out.println("随机数 :" + num);
    }
}

/*
随机数 :-145013416
*/