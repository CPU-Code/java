/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 13:18:55
 * @LastEditTime: 2020-09-12 13:21:14
 * @FilePath: \java\javaAPI\scanner_int.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI;

// 导包
import java.util.Scanner;

public class nextInt_int {
    public static void main(String[] args) {
        // 创建键盘录入数据的对象
        // 构造一个新的 Scanner ，它生成的值是从指定的输入流扫描
        Scanner sc = new Scanner(System.in);

        //接收数据
        // 将输入信息的下一个标记扫描为一个 int 值
        System.out.println("请输入整数");
        int i = sc.nextInt();

        //输出数据
        System.out.println("i:"+ i);
    }
}

/*
请输入整数
3
i:3
*/