package com.cpucode.java.string.table;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

//
/**
 * 产生10万个长度不超过10的字符串，包含a-z,A-Z
 * @author : cpucode
 * @Date : 2021/1/9
 * @Time : 11:18
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 * */
public class GenerateString {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("JVM//src//com//cpucode//java//StringTable//test.txt");
        int num = 100000;

        for (int i = 0; i < num; i++) {
            int length = (int) (Math.random() * (10 - 1 + 1) + 1);

            fw.write(getString(length) + "\n");
        }

        fw.close();
    }

    private static String getString(int length){
        Random rand = new Random(1);
        String str = "";

        for (int i = 0; i < length; i++) {
            //65 - 90, 97-122
            int num = (int)(Math.random() * (90 - 65 + 1 ) + 65) + (int)(rand.nextDouble() * 2) * 32;

            str += (char)num;
        }

        return str;
    }
}
