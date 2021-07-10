package com.cpucode.pattern.decorator.passport.old;

/**
 * @author : cpucode
 * @date : 2021/7/11
 * @time : 0:10
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface SigninServiceInter {
    ResultMsg regist(String username, String password);

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);
}
