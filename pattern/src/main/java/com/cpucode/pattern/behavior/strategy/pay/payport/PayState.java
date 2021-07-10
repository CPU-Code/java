package com.cpucode.pattern.behavior.strategy.pay.payport;

/**
 *  支付完成以后的状态
 *
 * @author : cpucode
 * @date : 2021/6/1
 * @time : 23:12
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code, String msg,Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString(){
        return ("支付状态： [" + code + "]," + msg + ",交易详情： " + data);
    }

}
