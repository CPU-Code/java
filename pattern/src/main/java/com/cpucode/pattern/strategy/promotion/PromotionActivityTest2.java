package com.cpucode.pattern.strategy.promotion;

import org.apache.commons.lang3.StringUtils;

/**
 * 满足了业务需求，客户可根据自己的需求选择不同的优惠策略了。
 * 但是，经过一段时间的业务积累，我们的促销活动会越来越多
 *
 * @author : cpucode
 * @date : 2021/6/1
 * @time : 22:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PromotionActivityTest2 {
    public static void main(String[] args) {
        PromotionActivity promotionActivity = null;

        String promotionKey = "COUPON";

        if (StringUtils.equals(promotionKey, "COUPON")){
            promotionActivity = new PromotionActivity(new CouponStrategy());
        }else if (StringUtils.equals(promotionKey, "CASHBACK")){
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        }

        promotionActivity.execute();
    }
}
