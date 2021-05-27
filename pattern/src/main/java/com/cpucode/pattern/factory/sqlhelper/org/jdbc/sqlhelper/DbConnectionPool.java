package com.cpucode.pattern.factory.sqlhelper.org.jdbc.sqlhelper;

import java.sql.Connection;
import java.util.Vector;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:59
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public final class DbConnectionPool extends Pool{
    /**
     * 正在使用的连接数
     */
    private int checkedOut;

    /**
     * 存放产生的连接对象容器
     */
    private Vector<Connection> freeConnections = new Vector<Connection>();

    /**
     * 密码
     */
    private String passWord = null;

    /**
     * 连接字符串
     */
    private String url = null;

    /**
     * 用户名
     */
    private String userName = null;

    /**
     * 空闲连接数
     */
    private static int num = 0;

    /**
     * 当前可用的连接数
     */
    private static int numActive = 0;

    /**
     * 连接池实例变量
     */
    private static DbConnectionPool pool = null;

    /**
     *  产生数据连接池
     * @return
     */
    public static synchronized DbConnectionPool getInstance(){
        if(pool == null){
            pool = new DbConnectionPool();
        }

        return pool;
    }

    /**
     * 获得一个 数据库连接池的实例
     */
    private DbConnectionPool() {

    }


    /**
     * 建立连接池
     */
    @Override
    public void createPool() {
        pool = new DbConnectionPool();
    }

    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public Connection getConnection(long time) {
        return null;
    }
}
