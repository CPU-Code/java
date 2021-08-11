package com.cpucode.rpc;

/**
 * @author : cpucode
 * @date : 2021/8/11
 * @time : 13:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface IHelloService {
    String sayHello(String content);

    /**
     * 保存用户
     * @param user
     * @return
     */
    String saveUser(User user);
}
