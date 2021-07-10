package com.cpucode.pattern.behavior.strategy.promotion;

/**
 * 促销活动
 *
 * @author : cpucode
 * @date : 2021/6/1
 * @time : 22:43
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PromotionActivityTest {
    public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());

        activity618.execute();
        activity1111.execute();
    }
}
