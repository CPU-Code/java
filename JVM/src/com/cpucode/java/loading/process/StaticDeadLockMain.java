package com.cpucode.java.loading.process;

/**
 * @author : cpucode
 * @date : 2021/2/2
 * @time : 20:45
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class StaticDeadLockMain extends Thread{
    private char flag;

    public StaticDeadLockMain(char flag){
        this.flag = flag;
        this.setName("Thread" + flag);
    }

    @Override
    public void run(){
        try {
            Class.forName("com.cpucode.java.loading.process.Static" + flag);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println(getName() + "结束");
    }

    public static void main(String[] args) {
        StaticDeadLockMain loadA = new StaticDeadLockMain('A');
        loadA.start();

        StaticDeadLockMain loadB = new StaticDeadLockMain('B');
        loadB.start();
    }
}

class StaticA{
    static {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){

        }

        try{
            Class.forName("com.cpucode.java.loading.process.StaticB");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("StaticA init OK");
    }
}

class StaticB{
    static{
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
        }

        try{
            Class.forName("com.cpucode.java.loading.process.StaticA");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("StaticB init OK");
    }
}
