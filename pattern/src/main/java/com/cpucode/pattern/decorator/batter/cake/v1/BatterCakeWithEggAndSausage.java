package com.cpucode.pattern.decorator.batter.cake.v1;

/**
 * @author : cpucode
 * @date : 2021/7/10
 * @time : 23:29
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BatterCakeWithEggAndSausage extends BatterCakeWithEgg {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    /**
     * 加一个香肠加2块钱
     * @return
     */
    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
