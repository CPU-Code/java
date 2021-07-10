package com.cpucode.pattern.structure.adapter.login.adapter.v1.service;

import com.cpucode.pattern.structure.adapter.login.adapter.Member;
import com.cpucode.pattern.structure.adapter.login.adapter.ResultMsg;

/**
 * 老系统的登录逻辑
 *
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 21:08
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SiginService {
    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password){
        return new ResultMsg(200,"注册成功", new Member());
    }

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password){
        return null;
    }
}
