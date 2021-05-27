package com.cpucode.principle.composite.reuse.optimization;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 21:01
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MySqlConnection extends DbConnection{
    @Override
    public String getConnection() {
        return "MySQL 数据库连接";
    }
}
