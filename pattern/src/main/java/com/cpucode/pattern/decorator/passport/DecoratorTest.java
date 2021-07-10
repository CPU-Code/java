package com.cpucode.pattern.decorator.passport;

import com.cpucode.pattern.decorator.passport.old.SigninService;
import com.cpucode.pattern.decorator.passport.upgrade.SiginForThirdService;
import com.cpucode.pattern.decorator.passport.upgrade.SiginForThirdServiceInter;

/**
 * @author : cpucode
 * @date : 2021/7/11
 * @time : 0:58
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DecoratorTest {
    public static void main(String[] args) {
        //满足一个is-a
        SiginForThirdServiceInter siginForThirdService = new SiginForThirdService(new SigninService());

        siginForThirdService.loginForQQ("cpuCode");
        siginForThirdService.login("cpucode", "cpucode");

        //为某个类实现动态增加或者覆盖原有方法的情况， 采用装饰器模式
    }
}
