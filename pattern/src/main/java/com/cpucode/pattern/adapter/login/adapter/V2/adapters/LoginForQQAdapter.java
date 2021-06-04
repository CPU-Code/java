package com.cpucode.pattern.adapter.login.adapter.V2.adapters;

import com.cpucode.pattern.adapter.login.adapter.ResultMsg;

/**
 * QQ 登录
 *
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 21:39
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LoginForQQAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
