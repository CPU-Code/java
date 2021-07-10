package com.cpucode.pattern.structure.decorator.batter.cake.v2;

/**
 * @author : cpucode
 * @date : 2021/7/10
 * @time : 23:43
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(BatterCake batterCake){
        super(batterCake);
    }

    @Override
    protected void doSomething() {
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + " +1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
