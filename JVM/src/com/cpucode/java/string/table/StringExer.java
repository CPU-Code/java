/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 10:44
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.string.table;

//String的不变性

public class StringExer {
    String str = "good";
    char[] ch = {'c', 'b','u'};

    public void change(String str, char[] ch){
        str = "hahahahha";
        ch[1] = 'p';
    }

    public static void main(String[] args) {
        StringExer ex = new StringExer();

        ex.change(ex.str, ex.ch);

        System.out.println(ex.str);
        System.out.println(ex.ch);
    }

}

/*
good
cpu
* */