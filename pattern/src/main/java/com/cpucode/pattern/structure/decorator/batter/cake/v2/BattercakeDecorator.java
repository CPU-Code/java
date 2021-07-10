package com.cpucode.pattern.structure.decorator.batter.cake.v2;

/**
 * @author : cpucode
 * @date : 2021/7/10
 * @time : 23:39
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public abstract class BattercakeDecorator extends BatterCake {
    /**
     * 静态代理，委派
     */
    private BatterCake batterCake;

    public BattercakeDecorator(BatterCake batterCake){
        this.batterCake = batterCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
