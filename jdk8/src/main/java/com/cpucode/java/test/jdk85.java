package com.cpucode.java.test;

public class jdk85 {
    public static void main(String[] args) {
        startThread(() -> System.out.println("线程任务执行"));
    }

    private static void startThread(Runnable task) {
        new Thread(task).start();
    }
}
