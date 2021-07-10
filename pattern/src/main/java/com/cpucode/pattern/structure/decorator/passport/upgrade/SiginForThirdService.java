package com.cpucode.pattern.structure.decorator.passport.upgrade;

import com.cpucode.pattern.structure.decorator.passport.old.ResultMsg;
import com.cpucode.pattern.structure.decorator.passport.old.SigninServiceInter;

/**
 * @author : cpucode
 * @date : 2021/7/11
 * @time : 0:56
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SiginForThirdService implements SiginForThirdServiceInter {
    private SigninServiceInter signinServiceInter;

    public SiginForThirdService(SigninServiceInter signinServiceInter) {
        this.signinServiceInter = signinServiceInter;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return signinServiceInter.regist(username, password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return signinServiceInter.login(username, password);
    }

    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }


}
