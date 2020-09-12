/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 14:25:18
 * @LastEditTime: 2020-09-12 14:36:29
 * @FilePath: \java\javaAPI\Random\guess_random.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.Random;

import java.util.Random;
import java.util.Scanner;

public class guess_random {
    public static void main(String[] args) {
        //系统产生一个随机数1‐100之间的
        Random r = new Random();

        int number = r.nextInt(100)+ 1;

        while(true)
        {
            //键盘输入我的猜的数
            Scanner sc = new Scanner(System.in);
            System.out.println("输入数字 (1- 100)");
            int guessNumber = sc.nextInt();

            if(guessNumber > number) {
                System.out.println("输入的数" + guessNumber + "大了");
            } else if(guessNumber < number){
                System.out.println("你猜的数" + guessNumber + "小了");
            } else {
                System.out.println("输入数对了");
                break;
            }

        }
    }
}

/*
输入数字 (1- 100)
50
输入的数50大了
输入数字 (1- 100)
25
输入的数25大了
输入数字 (1- 100)
12
你猜的数12小了
输入数字 (1- 100)
20
你猜的数20小了
输入数字 (1- 100)
21
输入数对了

Process finished with exit code 0

*/