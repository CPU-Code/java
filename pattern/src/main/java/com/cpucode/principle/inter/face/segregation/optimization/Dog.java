package com.cpucode.principle.inter.face.segregation.optimization;

/**
 * 一个类对一类的依赖应该建立在最小的接口之上
 * 建立单一接口，不要建立庞大臃肿的接口
 * 尽量细化接口，接口中的方法尽量少（不是越少越好，一定要适度）
 *
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 19:59
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Dog implements SwimAnimal, EatAnimal{
    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
