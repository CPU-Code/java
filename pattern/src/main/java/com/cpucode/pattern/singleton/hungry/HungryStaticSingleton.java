package com.cpucode.pattern.singleton.hungry;

/**
 * 饿汉式静态块单例
 *  利用静态代码块的机制
 *
 *  饿汉式适用在单例对象较少的情况
 *
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 11:13
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
