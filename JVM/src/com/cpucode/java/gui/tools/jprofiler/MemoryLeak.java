package com.cpucode.java.gui.tools.jprofiler;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * @author : cpucode
 * @date : 2021/2/15
 * @time : 11:14
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MemoryLeak {
    public static void main(String[] args) {
        while (true){
            ArrayList beanlist = new ArrayList();
            int num = 500;

            for (int i = 0; i < num; i++) {
                Bean data = new Bean();

                data.list.add(new byte[1024 * 10]);
                beanlist.add(data);
            }

            try{
                TimeUnit.MILLISECONDS.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Bean{
    int size = 109;
    String info = "cpuCode";
    static ArrayList list = new ArrayList();

    //ArrayList list = new ArrayList();
}