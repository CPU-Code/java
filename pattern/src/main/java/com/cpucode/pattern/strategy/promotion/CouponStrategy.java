package com.cpucode.pattern.strategy.promotion;

/**
 * 优惠券
 *
 * @author : cpucode
 * @date : 2021/6/1
 * @time : 22:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
    }
}
