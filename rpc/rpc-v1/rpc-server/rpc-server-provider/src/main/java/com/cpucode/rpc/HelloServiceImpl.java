package com.cpucode.rpc;

/**
 * @author : cpucode
 * @date : 2021/8/11
 * @time : 13:43
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String content) {
        System.out.println("request in sayHello: " + content);

        return "Say Hello:" + content;
    }

    @Override
    public String saveUser(User user) {
        System.out.println("request in saveUser:" + user);

        return "SUCCESS";
    }
}
