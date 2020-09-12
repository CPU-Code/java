/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 13:24:30
 * @LastEditTime: 2020-09-12 13:27:58
 * @FilePath: \java\javaAPI\nextInt_sum.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI;

public class nextInt_sum {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.println("输入数字");
        int a = sc.nextInt();

        System.out.println("输入数据");
        int b = sc.nextInt();

        // 数据求和
        int sum = a + b;
        System.out.println("sum " + sum);
    }
}


/*
输入数字
4
输入数据
2
sum  == 6
*/