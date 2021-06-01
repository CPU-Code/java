package com.cpucode.pattern.strategy.promotion;

/**
 * @author : cpucode
 * @date : 2021/6/1
 * @time : 23:03
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PromotionActivityTest3 {
    public static void main(String[] args) {
        String promotionKey = "GROUPBUY";

        PromotionActivity promotionActivity = new
                PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));

        promotionActivity.execute();
    }
}
