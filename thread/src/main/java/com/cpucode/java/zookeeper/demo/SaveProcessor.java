package com.cpucode.java.zookeeper.demo;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author : cpucode
 * @date : 2021/7/23
 * @time : 22:54
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SaveProcessor extends Thread implements RequestProcessor{
    LinkedBlockingQueue<Request> requests = new LinkedBlockingQueue<Request>();

    /**
     * 处理请求
     * @param request
     */
    @Override
    public void processRequest(Request request) {
        requests.add(request);
    }

    @Override
    public void run(){
        try {
            Request request = requests.take();

            System.out.println("begin save request info:" + request);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
