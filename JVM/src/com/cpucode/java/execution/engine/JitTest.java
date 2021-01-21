/**
 * User: cpucode
 * Date: 2021/1/8
 * Time: 20:46
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.execution.engine;

import java.util.ArrayList;
// cmd 中 运行 jconsole 查看 VM概要

public class JitTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int num = 1000;

        for (int i = 0; i < num; i++) {
            list.add("我是cpuCode");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
