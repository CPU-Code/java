package com.cpucode.pattern.strategy.pay.payport;

/**
 * 银联支付
 *
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 12:06
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 120;
    }
}
