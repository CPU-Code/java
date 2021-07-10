package com.cpucode.pattern.behavior.strategy.pay.payport;

/**
 * 支付宝
 *
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 12:03
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
