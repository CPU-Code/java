package com.cpucode.spring.demo.service.impl;

import com.cpucode.spring.demo.service.IQueryService;
import com.cpucode.spring.formework.annotation.CPService;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 查询业务
 *
 * @author : cpucode
 * @date : 2021/8/5
 * @time : 11:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@CPService
@Slf4j
public class QueryService implements IQueryService {
    /**
     * 查询
     * @param name
     * @return
     */
    @Override
    public String query(String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(new Date());
        String json = "{name:\"" + name + "\",time:\"" + time + "\"}";

        log.info("这是在业务方法中打印的： " + json);

        return json;
    }
}
