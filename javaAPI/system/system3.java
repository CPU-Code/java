/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 13:00:44
 * @LastEditTime: 2020-09-16 13:01:27
 * @FilePath: \java\javaAPI\system\system3.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.system;

public class system3 {
    int[] src = new int[] {1, 2, 3, 4, 5};
    int[] dest = new int[] {6, 7, 8, 9, 10};

    System .arraycopy(src, 0, dest, 0, 3);

    for(int i = 0; i < src.length ;i ++){
        System.out.print(src[i]);
    }

    System.out.println();

    for(int i = 0; i < dest.length ;i ++){
        System.out.print(dest[i]);
    }
}

/*
12345
123910
*/