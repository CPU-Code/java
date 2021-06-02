package com.cpucode.pattern.strategy.pay.payport;

/**
 * 京东白条
 *
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 12:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
