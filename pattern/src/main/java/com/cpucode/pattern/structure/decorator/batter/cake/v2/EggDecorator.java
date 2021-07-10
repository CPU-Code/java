package com.cpucode.pattern.structure.decorator.batter.cake.v2;

/**
 * @author : cpucode
 * @date : 2021/7/10
 * @time : 23:41
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class EggDecorator extends BattercakeDecorator {
    public EggDecorator(BatterCake batterCake){
        super(batterCake);
    }

    @Override
    protected void doSomething() {
    }

    @Override
    protected String getMsg(){
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
