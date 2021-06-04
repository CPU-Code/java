package com.cpucode.pattern.adapter.login.adapter.V2.adapters;

import com.cpucode.pattern.adapter.login.adapter.ResultMsg;

/**
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 21:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
