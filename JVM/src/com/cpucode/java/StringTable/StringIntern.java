/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 15:38
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.StringTable;

/**
 * 如何保证变量s指向的是字符串常量池中的数据呢？
 * 有两种方式：
 * 方式一： String s = "shkstart";//字面量定义的方式
 * 方式二： 调用intern()
 *         String s = new String("shkstart").intern();
 *         String s = new StringBuilder("shkstart").toString().intern();
 */
public class StringIntern {
    public static void main(String[] args) {
        String s = new String("1");

        //调用此方法之前，字符串常量池中已经存在了"1"
        s.intern();

        String s2 = "1";
        //jdk6：false   jdk7/8：false
        System.out.println(s == s2);

        //s3变量记录的地址为：new String("11")
        String s3 = new String("1") + new String("1");

        //执行完上一行代码以后，字符串常量池中，不存在"11"

        //在字符串常量池中生成"11"
        // jdk6: 创建了一个新的对象"11",也就有新的地址
        // jdk7/8: 此时常量中并没有创建"11",而是创建一个指向堆空间中new String("11")的地址
        s3.intern();

        //s4变量记录的地址：使用的是上一行代码代码执行时，在常量池中生成的"11"的地址
        String s4 = "11";

        //jdk6：false  jdk7/8：true
        System.out.println(s3 == s4);
    }
}
