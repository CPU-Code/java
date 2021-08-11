package com.cpucode.rpc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/8/11 15:24
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        RpcProxyClient rpcProxyClient = context.getBean(RpcProxyClient.class);

        IPaymentService iPaymentService =
                rpcProxyClient.clientProxy(IPaymentService.class, "localhost", 8080);

        iPaymentService.doPay();

        IHelloService iHelloService =
                rpcProxyClient.clientProxy(IHelloService.class, "localhost", 8080, "v1.0");

        String result = iHelloService.sayHello("cpuCode v1.0");
        System.out.println(result);

        IHelloService iHelloService2 =
                rpcProxyClient.clientProxy(IHelloService.class, "localhost", 8080, "v2.0");

        String result2 = iHelloService2.sayHello("cpuCode v2.0");
        System.out.println(result2);
    }
}
