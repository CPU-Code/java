package com.cpucode.pattern.adapter.login.adapter.v2.adapters;

import com.cpucode.pattern.adapter.login.adapter.ResultMsg;

/**
 * 新浪微博登录
 *
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 21:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LoginForSinaAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
