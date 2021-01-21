/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 11:35
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.string.table;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
* -XX:StringTableSize=1009
* 花费的时间为：126
*
* -XX:StringTableSize=100009
* 花费的时间为：48
* */
public class StringTime {
    public static void main(String[] args) {
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("JVM//src//com//cpucode//java//StringTable//test.txt"));
            long start = System.currentTimeMillis();

            String data;

            while ((data = br.readLine()) != null){
                //如果字符串常量池中没有对应data的字符串的话，则在常量池中生成
                data.intern();
            }

            long end = System.currentTimeMillis();

            System.out.println("花费的时间为：" + (end - start));
        } catch(IOException e){
            e.printStackTrace();
        } finally {
            if (br != null){
                try{
                    br.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
