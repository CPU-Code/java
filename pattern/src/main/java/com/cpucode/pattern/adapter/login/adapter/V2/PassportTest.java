package com.cpucode.pattern.adapter.login.adapter.V2;

/**
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 22:05
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PassportTest {
    public static void main(String[] args) {
        IPassportForThird passportForThird = new PassportForThirdAdapter();

        passportForThird.loginForQQ("111");
    }
}
