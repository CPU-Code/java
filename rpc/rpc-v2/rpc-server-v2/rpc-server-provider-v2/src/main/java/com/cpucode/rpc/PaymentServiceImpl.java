package com.cpucode.rpc;

/**
 * @author : cpucode
 * @date : 2021/8/11 16:09
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RpcService(IPaymentService.class)
public class PaymentServiceImpl implements IPaymentService{
    @Override
    public void doPay() {
        System.out.println("执行doPay方法");
    }
}
