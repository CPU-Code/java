/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 13:29:43
 * @LastEditTime: 2020-09-12 14:03:23
 * @FilePath: \java\javaAPI\nextInt_max.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI;

public class nextInt_max {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.println("输入数字");
        int a = sc.nextInt();

        System.out.println("输入数据");
        int b = sc.nextInt();

        System.out.println("输入数字");
        int c = sc.nextInt();

        // 数据求和
        int temp = (a > b ? a : b);
        int max = (temp > c ? temp : c);
        System.out.println("max == " + max);
    }
}

/*
输入数字
3
输入数据
5
输入数字
7
max == 7

Process finished with exit code 0
*/
