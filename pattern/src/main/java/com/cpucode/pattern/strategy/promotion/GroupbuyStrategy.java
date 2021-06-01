package com.cpucode.pattern.strategy.promotion;

/**
 * 拼团优惠
 *
 * @author : cpucode
 * @date : 2021/6/1
 * @time : 22:39
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GroupbuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团， 满 20 人成团， 全团享受团购价");
    }
}
