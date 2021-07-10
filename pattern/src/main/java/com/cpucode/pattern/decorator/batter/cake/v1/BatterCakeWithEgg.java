package com.cpucode.pattern.decorator.batter.cake.v1;

/**
 * @author : cpucode
 * @date : 2021/7/10
 * @time : 23:28
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BatterCakeWithEgg extends BatterCake{
    @Override
    protected String getMsg(){
        return super.getMsg() + "+1个鸡蛋";
    }

    /**
     * 加一个鸡蛋加1块钱
     * @return
     */
    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
