/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 13:19:18
 * @LastEditTime: 2020-09-16 13:19:30
 * @FilePath: \java\javaAPI\stringBuilder\stringBuilder4.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.stringBuilder;

public class stringBuilder4 {
    public static void main(String[] args) {
        // 链式创建
        StringBuilder sb = new StringBuilder("cpucode").append("hello").append("java");

        // 调用方法
        String str = sb.toString();
        System.out.println(str);
    }
}

/*
cpucodehellojava
*/