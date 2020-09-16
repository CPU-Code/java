/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 13:07:11
 * @LastEditTime: 2020-09-16 13:09:18
 * @FilePath: \java\javaAPI\stringBuilder\stringBuilder2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.stringBuilder;

public class stringBuilder2 {
    public static void main(String[] args) {
        // 构造一个空的StringBuilder容器
        StringBuilder sbl = new StringBuilder();

        // // (空白)
        System.out.println(sbl);
        
        // 使用带参构造
        // 构造一个StringBuilder容器，并将字符串添加进去
        StringBuilder sb2 = new StringBuilder("CPUCODE");
        System.out.println(sb2);
    }
}

/*

CPUCODE
*/