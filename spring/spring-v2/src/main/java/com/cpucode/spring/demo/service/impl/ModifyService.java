package com.cpucode.spring.demo.service.impl;

import com.cpucode.spring.demo.service.IModifyService;

/**
 * 增删改业务
 *
 * @author : cpucode
 * @date : 2021/8/5
 * @time : 19:05
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ModifyService implements IModifyService {

    /**
     * 增加
     * @param name
     * @param addr
     * @return
     */
    @Override
    public String add(String name, String addr) {
        return "modifyService add,name=" + name + ",addr=" + addr;
    }

    /**
     * 修改
     * @param id
     * @param name
     * @return
     */
    @Override
    public String edit(Integer id, String name) {
        return "modifyService edit,id=" + id + ",name=" + name;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public String remove(Integer id) {
        return "modifyService id=" + id;
    }
}
