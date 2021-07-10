package com.cpucode.pattern.behavior.template.jdbc;

import java.sql.ResultSet;

/**
 * 约束 ORM 逻辑的接口
 *
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 14:51
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
