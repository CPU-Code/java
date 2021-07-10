package com.cpucode.pattern.behavior.strategy.promotion;

/**
 * 返现活动
 *
 * @author : cpucode
 * @date : 2021/6/1
 * @time : 22:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
