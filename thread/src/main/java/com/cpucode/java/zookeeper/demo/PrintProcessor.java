package com.cpucode.java.zookeeper.demo;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author : cpucode
 * @date : 2021/7/23
 * @time : 22:49
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PrintProcessor extends Thread implements RequestProcessor{
    LinkedBlockingQueue<Request> requests = new LinkedBlockingQueue<Request>();

    private final RequestProcessor nextProcessor;

    public PrintProcessor(RequestProcessor nextProcessor){
        this.nextProcessor = nextProcessor;
    }

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
        while (true){
            try{
                Request request = requests.take();
                System.out.println("print data:" + request.getName());

                nextProcessor.processRequest(request);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
