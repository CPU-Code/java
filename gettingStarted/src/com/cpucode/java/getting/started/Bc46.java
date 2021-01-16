package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * KiKi开始学习英文字母，BoBo老师告诉他，有五个字母A(a), E(e), I(i), O(o),U(u)称为元音，其他所有字母称为辅音，请帮他编写程序判断输入的字母是元音（Vowel）还是辅音（Consonant）。
 * 输入描述:
 * 多组输入，每行输入一个字母。
 * 输出描述:
 * 针对每组输入，输出为一行，如果输入字母是元音（包括大小写），输出“Vowel”，如果输入字母是非元音，输出“Consonant”。
 * 示例1
 * 输入
 * A
 * b
 * 输出
 * Vowel
 * Consonant
 *
 * @author : cpucode
 * @Date : 2021/1/15
 * @Time : 20:41
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc46 {
    public static void main(String[] args) throws IOException{
        //test1();
        //test2();
        //test3();
        //test4();
        test5();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            char num = str.charAt(0);

            if(num == 'a' || num == 'A' ||
                    num == 'e' || num == 'E' ||
                    num == 'i' || num == 'I' ||
                    num == 'o' || num == 'O' ||
                    num == 'u'  || num == 'U'){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }
    }

    private static void test2() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        String vowel = "AEIOUaeiou";

        while((str = bf.readLine()) != null){
            //返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
            if(vowel.indexOf(str) != -1){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }
    }

    private static void test3() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            //判断 Number 对象与方法的参数进是否相等
            if("A".equals(str) || "a".equals(str) ||
               "e".equals(str) || "E".equals(str) ||
               "i".equals(str) || "I".equals(str) ||
               "o".equals(str) || "O".equals(str) ||
               "u".equals(str) || "U".equals(str)){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }
    }

    private static void test4() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            //将字符串与指定的对象比较，不考虑大小写
            if("a".equalsIgnoreCase(str) || "e".equalsIgnoreCase(str) ||
               "i".equalsIgnoreCase(str) || "o".equalsIgnoreCase(str) ||
               "u".equalsIgnoreCase(str)){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }
    }

    private static void test5() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            //判断字符串中是否包含指定的字符或字符串
            if(str.contains("a") || str.contains("A") ||
               str.contains("e") || str.contains("E") ||
               str.contains("i") || str.contains("I") ||
               str.contains("o") || str.contains("O") ||
               str.contains("u") || str.contains("U")){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }
    }
}
