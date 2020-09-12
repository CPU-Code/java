/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 20:37:04
 * @LastEditTime: 2020-09-12 20:45:33
 * @FilePath: \java\javaAPI\String\conversion_string.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.String;

public class conversion_string {
    public static void main(String[] args){
        //创建字符串对象
        String s = "cpucode";

        // char[] toCharArray():把字符串转换为字符数组
        char[] chs = s.toCharArray();
        for(int i = 0; i < chs.length; i++){
            System.out.println(chs[i]);
        }
        System.out.println("---------");

        // byte[] getBytes ():把字符串转换为字节数组
        byte[] bytes = s.getBytes();
        for(int i = 0; i < bytes.length; i++){
            System.out.println(bytes[i]);
        }
        System.out.println("--------");

        // 替换字母为大写
        String str = "cpucode";
        String replace = str.replace("c", "C");

        System.out.println(replace);
        System.out.println("--------");
    }
}

/*
c
p
u
c
o
d
e
---------
99
112
117
99
111
100
101
--------
CpuCode
--------

*/