/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 11:41:01
 * @LastEditTime: 2020-09-12 11:44:56
 * @FilePath: \java\javaAPI\error_string_compare.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI;

public class error_string_compare {
    public static void main(String[] args) {
        String s1 = "cpucode";
        String s2 = "cpucode";

        // 必须使用equals()方法而不能用==
        
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

/*
true
true
*/