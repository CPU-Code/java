package com.cpucode.pattern.behavior.strategy.promotion;

/**
 * 无优惠
 *
 * @author : cpucode
 * @date : 2021/6/1
 * @time : 22:39
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
