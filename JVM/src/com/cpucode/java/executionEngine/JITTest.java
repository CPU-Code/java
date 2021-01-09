/**
 * User: cpucode
 * Date: 2021/1/8
 * Time: 20:46
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.executionEngine;

import java.util.ArrayList;
// cmd 中 运行 jconsole 查看 VM概要

public class JITTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            list.add("我是cpuCode");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
