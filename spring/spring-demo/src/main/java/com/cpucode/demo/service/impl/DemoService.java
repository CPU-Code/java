package com.cpucode.demo.service.impl;

import com.cpucode.demo.service.IDemoService;
import com.cpucode.mvcframework.annotation.CPService;

/**
 *  核心业务逻辑
 *
 * @author : cpucode
 * @date : 2021/7/15
 * @time : 20:39
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@CPService
public class DemoService implements IDemoService {
    @Override
    public String get(String name) {
        return "My name is " + name;
    }
}
