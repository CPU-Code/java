/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 20:23:52
 * @LastEditTime: 2020-09-12 20:34:14
 * @FilePath: \java\javaAPI\String\get_string.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.String;

public class get_string {
    public static void main(String[] args){
        //创建字符串对象
        String s = "cpucode";

        // int length():获取字符串的长度，其实也就是字符个数
        System.out.println(s.length());
        System.out.println("-----------");

        // String concat (String str):将将指定的字符串连接到该字符串的末尾.
        String s2 = s.concat("**cpucode**");

        System.out.println(s2);

        // char charAt(int index):获取指定索引处的字符
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println("-------");

        // int indexOf(String str):获取str在字符串对象中第一次出现的索引,没有返回‐1
        System.out.println(s.indexOf("u"));
        System.out.println(s.indexOf("co"));
        System.out.println("----------");

        // String substring(int start):从start开始截取字符串到字符串结尾
        System.out.println(s.substring(0));
        System.out.println(s.substring(5));
        System.out.println("‐‐‐‐‐‐‐‐");

        // String substring(int start,int end):从start到end截取字符串。含start，不含end
        System.out.println(s.substring(0, s.length()));
        System.out.println(s.substring(3, 5));
    }
}

/*
7
-----------
cpucode**cpucode**
c
p
-------
2
3
----------
cpucode
de
‐‐‐‐‐‐‐‐
cpucode
co
*/