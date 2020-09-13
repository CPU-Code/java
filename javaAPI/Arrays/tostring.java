/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 11:01:53
 * @LastEditTime: 2020-09-13 11:07:15
 * @FilePath: \java\javaAPI\Arrays\tostring.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.Arrays;

public class tostring {

    public static void main(Stirng[] args){
        // 定义int 数组
        int[] arr = {2, 34, 35, 4, 657, 8, 69, 9};
        // 打印数组,输出地址值
        System.out.println(arr); 

        // 数组内容转为字符串
        String s = Arrays.toString(arr);

        // 打印字符串,输出内容
        System.out.println(s); // [2, 34, 35, 4, 657, 8, 69, 9]
    }
}

/*
[I@10f87f48
[2, 34, 35, 4, 657, 8, 69, 9]
*/