package com.cpucode.java.condition;

import java.util.concurrent.CyclicBarrier;

/**
 * @author : cpucode
 * @date : 2021/7/30
 * @time : 16:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CycliBarrierDemo extends Thread{
    @Override
    public void run(){
        System.out.println("开始进行数据分析");
    }

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new CycliBarrierDemo());

        new Thread(new DataImportThread(cyclicBarrier,"file1")).start();
        new Thread(new DataImportThread(cyclicBarrier,"file2")).start();
        new Thread(new DataImportThread(cyclicBarrier,"file3")).start();
    }
}
