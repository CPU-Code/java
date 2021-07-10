package com.cpucode.pattern.create.singleton.lazy.innerClass;

/**
 * 这种形式兼顾饿汉式的内存浪费， 也兼顾 synchronized 性能问题
 *
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 12:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LazyInnerClassSingleton {
    /**
     * 默认使用 LazyInnerClassGeneral的时候，会先初始化内部类
     *
     * 如果没使用的话， 内部类是不加载的
     */
    private LazyInnerClassSingleton(){
        if (LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    /**
     * 静态内部类
     * 内部类一定是要在方法调用之前初始化，巧妙地避免了线程安全问题
     * 默认不加载
     */
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    /**
     * 每一个关键字都不是多余的
     * static 是为了使单例的空间共享
     * final 保证这个方法不会被重写，重载
     *
     * @return
     */
    public static final LazyInnerClassSingleton getInstance(){
        // 在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }
}
