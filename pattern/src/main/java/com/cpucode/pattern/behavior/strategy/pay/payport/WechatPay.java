package com.cpucode.pattern.behavior.strategy.pay.payport;

/**
 * 微信支付
 *
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 12:05
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 256;
    }
}
