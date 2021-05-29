package com.cpucode.pattern.singleton.register.en.um;

/**
 * 注册式单例又称为登记式单例，就是将每一个实例都登记到某一个地方，使用唯一的标识获取实例
 *
 * 枚举登记
 *
 *  枚举式单例在 静态代码块 中就给 INSTANCE 进行了赋值，是 饿汉式单例 的实现
 *
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 13:13
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData(){
        return data;
    }

    public void setData(Object data){
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
