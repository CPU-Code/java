/**
 * User: cpucode
 * Date: 2021/1/10
 * Time: 18:45
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.garbage.collection;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

//虚引用的测试
public class PhantomReferenceTest {
    //当前类对象的声明
    public static PhantomReferenceTest obj;
    //引用队列
    static ReferenceQueue<PhantomReferenceTest> phantomQueue = null;

    public static class CheckRefQueue extends Thread{
        @Override
        public void run(){
            while (true){
                if (phantomQueue != null){
                    PhantomReference<PhantomReferenceTest> objt = null;

                    System.out.println("我进来了 CheckRefQueue");
                    try{
                        objt = (PhantomReference<PhantomReferenceTest>) phantomQueue.remove();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    if (objt != null){
                        System.out.println("追踪垃圾回收过程：PhantomReferenceTest 实例被GC了");
                    }
                }
            }
        }
    }

    //finalize()方法只能被调用一次！
    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        System.out.println("调用当前类的finalize()方法");
        obj = this;
    }

    public static void main(String[] args) {
        Thread t = new CheckRefQueue();
        //设置为守护线程：当程序中没有非守护线程时，守护线程也就执行结束。
        t.setDaemon(true);
        t.start();

        phantomQueue = new ReferenceQueue<PhantomReferenceTest>();
        obj = new PhantomReferenceTest();

        //构造了 PhantomReferenceTest 对象的虚引用，并指定了引用队列
        PhantomReference<PhantomReferenceTest> phantomRef =
                new PhantomReference<PhantomReferenceTest>(obj, phantomQueue);

        try{
            //不可获取虚引用中的对象
            System.out.println(phantomRef.get());

            //将强引用去除
            obj =  null;

            System.out.println("进行GC");

            //第一次进行GC,由于对象可复活，GC无法回收该对象
            System.gc();
            Thread.sleep(1000);

            if (obj == null){
                System.out.println("obj 是 null");
            } else {
                System.out.println("obj 可用");
            }

            System.out.println();
            System.out.println("第 2 次 gc");

            obj = null;

            System.out.println("进行GC");
            //一旦将obj对象回收，就会将此虚引用存放到引用队列中
            System.gc();

            Thread.sleep(1000);

            if (obj == null){
                System.out.println("obj 是 null");
            } else {
                System.out.println("obj 可用");
            }

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

/*
null
我进来了 CheckRefQueue
进行GC
调用当前类的finalize()方法
obj 可用

第 2 次 gc
进行GC
追踪垃圾回收过程：PhantomReferenceTest 实例被GC了
我进来了 CheckRefQueue
obj 是 null

* */