package com.cpucode.pattern.structure.decorator.passport.old;

/**
 * @author : cpucode
 * @date : 2021/7/11
 * @time : 0:15
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SigninService implements SigninServiceInter {
    @Override
    public ResultMsg regist(String username, String password) {
        return  new ResultMsg(200,"注册成功", new Member());
    }

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    @Override
    public ResultMsg login(String username, String password) {
        return new ResultMsg(200,"登录成功", new Member());
    }
}
