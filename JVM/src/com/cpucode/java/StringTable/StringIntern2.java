/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 16:32
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.StringTable;

public class StringIntern2 {
    public static void main(String[] args) {
        String s1 = new String("1") + new String("1");
        //执行完上一行代码以后，字符串常量池中，不存在"11"

        //在字符串常量池中生成对象"11"
        String s2 = "11";
        //把常量池引用给s3
        String s3 = s2.intern();

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
    }
}

/*
false
true

* */