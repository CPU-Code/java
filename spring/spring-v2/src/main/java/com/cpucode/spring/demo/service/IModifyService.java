package com.cpucode.spring.demo.service;

/**
 * 增删改业务
 *
 * @author : cpucode
 * @date : 2021/8/5
 * @time : 19:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface IModifyService {
    /**
     * 添加
     * @param name
     * @param addr
     * @return
     */
    public String add(String name, String addr) throws Exception;

    /**
     * 修改
     * @param id
     * @param name
     * @return
     */
    public String edit(Integer id, String name);

    /**
     * 删除
     * @param id
     * @return
     */
    public String remove(Integer id);
}
