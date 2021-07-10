package com.cpucode.pattern.decorator.passport.upgrade;

import com.cpucode.pattern.decorator.passport.old.ResultMsg;
import com.cpucode.pattern.decorator.passport.old.SigninServiceInter;

/**
 * 第三方登录自由适配
 *
 * @author : cpucode
 * @date : 2021/7/11
 * @time : 0:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface SiginForThirdServiceInter extends SigninServiceInter {
    /**
     * QQ登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);

    /**
     * 记住登录状态后自动登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机号登录
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);

    /**
     * 注册后自动登录
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForRegist(String username, String passport);
}
