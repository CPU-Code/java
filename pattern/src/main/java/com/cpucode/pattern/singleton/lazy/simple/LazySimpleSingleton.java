package com.cpucode.pattern.singleton.lazy.simple;

/**
 * 懒汉式单例
 *   被外部类调用的时候内部类才会加载
 *
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 11:20
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton(){}

    /**
     * 静态块， 公共内存区域
     * @return
     */
    private static LazySimpleSingleton lazySimpleSingleton = null;

    /**
     * synchronized 关键字，是这个方法变成线程同步方法
     * @return
     */
    public synchronized static LazySimpleSingleton getInstance(){
        if (lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }

        return lazySimpleSingleton;
    }
}
