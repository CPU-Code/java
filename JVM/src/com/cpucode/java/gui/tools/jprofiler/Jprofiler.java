package com.cpucode.java.gui.tools.jprofiler;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * 功能演示测试
 *
 * @author : cpucode
 * @date : 2021/2/15
 * @time : 11:10
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Jprofiler {
    public static void main(String[] args) {
        while(true){
            ArrayList list = new ArrayList();
            int num = 500;

            for (int i = 0; i < num; i++) {
                Data data = new Data();

                list.add(data);
            }

            try{
                TimeUnit.MILLISECONDS.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Data{
    private int size = 10;
    private byte[] buffer = new byte[1024 * 1024];
    private String info = "cpuCode";
}