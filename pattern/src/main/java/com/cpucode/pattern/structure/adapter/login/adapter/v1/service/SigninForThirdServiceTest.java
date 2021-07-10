package com.cpucode.pattern.structure.adapter.login.adapter.v1.service;

/**
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 21:28
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SigninForThirdServiceTest {
    public static void main(String[] args) {
        SigninForThirdService service = new SigninForThirdService();

        //不改变原来的代码， 也要能够兼容新的需求
        // 还可以再加一层策略模式
        service.login("tom","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
}
