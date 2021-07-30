package com.cpucode.java.condition;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author : cpucode
 * @date : 2021/7/30
 * @time : 16:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DataImportThread extends Thread{
    private CyclicBarrier cyclicBarrier;

    private String path;

    public DataImportThread(CyclicBarrier cyclicBarrier, String path) {
        this.cyclicBarrier = cyclicBarrier;
        this.path = path;
    }

    @Override
    public void run() {
        System.out.println("开始导入：" + path + " 数据");

        //TODO
        try {
            //阻塞 condition.await()
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
