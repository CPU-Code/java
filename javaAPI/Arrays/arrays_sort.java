/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 11:08:15
 * @LastEditTime: 2020-09-13 11:11:45
 * @FilePath: \java\javaAPI\Arrays\arrays_sort.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.Arrays;

import java.util.Arrays;

public class arrays_sort {
    public static void main(String[] args){

        // 定义int 数组
        int[] arr = {24, 7, 5, 3};

        System.out.println("排序前" + Arrays.toString(arr));

        // 升序排序
        Arrays.sort(arr);

        System.out.println("排序后" + Arrays.toString(arr));
    }
}

/*
排序前[24, 7, 5, 3]
排序后[3, 5, 7, 24]
*/