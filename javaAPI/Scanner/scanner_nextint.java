/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 14:10:32
 * @LastEditTime: 2020-09-13 14:14:38
 * @FilePath: \java\javaAPI\Scanner\scanner_nextint.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.Scanner;

import java.util.Scanner; // 导包

/*
Scanner类的功能：可以实现键盘输入数据，到程序当中。

引用类型的一般使用步骤：

导包 :
import 包路径.类名称;
如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
只有java.lang包下的内容不需要导包，其他的包都需要import语句。

创建 :
类名称 对象名 = new 类名称();

使用 :
对象名.成员方法名()

获取键盘输入的一个int数字：int num = sc.nextInt();
获取键盘输入的一个字符串：String str = sc.next();
 */
public class scanner_nextint {
    public static void main(String[] args){

        // 创建
        // 备注：System.in代表从键盘进行输入
        Scanner sc = new Scanner(System.in);

        // 获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("输入int数是 :" + num);

        // 获取键盘输入的字符串
        String str = sc.next();
        System.out.println("输入符号串 :" + str);
    }
}

/*
33
输入int数是 :33
cpucode
输入符号串 :cpucode
*/
