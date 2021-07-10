package com.cpucode.pattern.structure.adapter.login.adapter.v1.service;

import com.cpucode.pattern.structure.adapter.login.adapter.ResultMsg;

/**
 * 稳定的方法不去动， 直接继承下来
 *
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 21:24
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SigninForThirdService extends SiginService {
    public ResultMsg loginForQQ(String openId){
        //1、openId是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为QQ_EMPTY
        //3、注册（在原有系统里面创建一个用户）

        //4、调用原来的登录方法

        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String token){
        //通过token拿到用户信息，然后再重新登陆了一次
        return  null;
    }

    public ResultMsg loginForTelphone(String telphone, String code){

        return null;
    }

    public ResultMsg loginForRegist(String username, String password){
        super.regist(username,null);
        return super.login(username,null);
    }

}
