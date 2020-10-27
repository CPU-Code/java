/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 11:14:25
 * @LastEditTime: 2020-09-13 11:17:54
 * @FilePath: \java\javaAPI\Arrays\tochararray_sort.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.Arrays;

import java.util.Arrays;

public class tochararray_sort {
    public static void main(String[] args){

        // 定义字符串
        String line = "cpucode";

        // 转换为字符数组
        char[] chars = line.toCharArray();
        
        // 升序排序
        Arrays.sort(chars);

        // 反向遍历打印
        for(int i = chars.length - 1; i >= 0; i--){
            System.out.println(chars[i] + " ");
        }
    }
}

/*
u p o e d c c 
*/