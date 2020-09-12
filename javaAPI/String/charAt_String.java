/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 21:44:25
 * @LastEditTime: 2020-09-12 21:54:31
 * @FilePath: \java\javaAPI\String\charAt_String.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.String;

import java.util.Scanner;

public class charAt_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数 :");
        String s = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                bigCount++;
            } else if(ch >= 'a' && ch <= 'z'){
                smallCount++;
            } else if(ch >= '0' && ch <= '9'){
                numberCount++;
            } else {
                System.out.println("字符" + ch + "非法");
            }
        }

        System.out.println("大写字符" + bigCount + "个");
        System.out.println("小写字符" + smallCount + "个");
        System.out.println("数字字符" + numberCount + "个");
    }
}

/*
输入数 :
CpuCode12
大写字符2个
小写字符5个
数字字符2个
*/