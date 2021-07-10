package com.cpucode.pattern.structure.decorator.batter.cake.v2;

/**
 * @author : cpucode
 * @date : 2021/7/10
 * @time : 23:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BaseBatterCake extends BatterCake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
