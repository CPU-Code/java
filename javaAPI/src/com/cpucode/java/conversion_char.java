/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 12:13:13
 * @LastEditTime: 2020-09-12 12:14:28
 * @FilePath: \java\javaAPI\conversion_char.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI;

public class conversion_char {
    public static void main(String[] args) {
        char[] cs = "cpu_code".toCharArray();
        String s = new String(cs);

        System.out.println(s);

        // 修改了char[]数组，String并不会改变
        cs[0] = 'x';
        System.out.println(s);
    }
}

/*
new String(char[])创建新的String实例时，它并不会直接引用传入的char[]数组，而是会复制一份，
所以，修改外部的char[]数组不会影响String实例内部的char[]数组，因为这是两个不同的数组
*/

/*
cpu_code
cpu_code
*/