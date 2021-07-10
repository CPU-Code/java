package com.cpucode.pattern.behavior.strategy.pay.payport;

/**
 * 支付渠道
 *
 * @author : cpucode
 * @date : 2021/6/1
 * @time : 23:11
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public abstract class Payment {
    /**
     * 支付类型
     * @return
     */
    public abstract String getName();

    /**
     * 查询余额
     * @param uid
     * @return
     */
    protected abstract double queryBalance(String uid);

    /**
     * 扣款支付
     * @param uid
     * @param amount
     * @return
     */
    public PayState pay(String uid, double amount) {
        if(queryBalance(uid) < amount){
            return new PayState(500, "支付失败", "余额不足");
        }

        return new PayState(200, "支付成功", "支付金额： " + amount);
    }
}
