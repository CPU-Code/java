package com.cpucode.java.zookeeper.demo;

/**
 * 异步责任链模式
 *
 * @author : cpucode
 * @date : 2021/7/23
 * @time : 22:54
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MainDemo {
    PrintProcessor printProcessor;

    protected MainDemo(){
        SaveProcessor saveProcessor = new SaveProcessor();
        saveProcessor.start();

        printProcessor = new PrintProcessor(saveProcessor);
        printProcessor.start();
    }

    public static void main(String[] args) {
        Request request = new Request();

        request.setName("cpucode");
        new MainDemo().doTest(request);
    }

    public void doTest(Request request){
        printProcessor.processRequest(request);
    }
}
