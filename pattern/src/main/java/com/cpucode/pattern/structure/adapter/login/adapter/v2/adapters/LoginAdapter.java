package com.cpucode.pattern.structure.adapter.login.adapter.v2.adapters;

import com.cpucode.pattern.structure.adapter.login.adapter.ResultMsg;

/**
 * 在适配器里面，这个接口是可有可无，不要跟模板模式混淆
 * 模板模式一定是抽象类，而这里仅仅只是一个接口
 *
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 21:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
