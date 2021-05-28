package com.cpucode.pattern.singleton.hungry;

/**
 * 饿汉式单例
 *  在类加载的时候就立即初始化，并且创建单例对象。
 *  绝对线程安全，在线程还没出现以前就是实例化了，不可能存在访问安全问题
 *
 *  优点：
 *    没有加任何的锁、执行效率比较高，在用户体验上来说，比懒汉式更好。
 * 缺点：
 *  类加载的时候就初始化，不管用与不用都占着空间，浪费了内存，有可能占着茅坑不拉屎
 *
 *  Spring 中 IOC 容器 ApplicationContext 本身就是典型的饿汉式单例
 *
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 11:09
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class HungrySingleton {
    /**
     * 执行顺序 :
     * 先静态、后动态
     * 先属性、后方法
     * 先上后下
     */
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
