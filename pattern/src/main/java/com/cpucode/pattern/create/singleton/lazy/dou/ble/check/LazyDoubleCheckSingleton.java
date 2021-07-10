package com.cpucode.pattern.create.singleton.lazy.dou.ble.check;

/**
 * 双重检查锁的单例模式
 *
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 11:39
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazy == null){
            synchronized(LazyDoubleCheckSingleton.class){
                if (lazy == null){
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置 lazy 指向刚分配的内存地址
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }

        return lazy;
    }
}
