package com.cpucode.pattern.factory.sqlhelper.org.jdbc.sqlhelper;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * 自定义连接池 getInstance()返回 POOL 唯一实例,
 *  第一次调用时将执行构造函数构造函数 Pool()
 *  调用驱动装载 loadDrivers()函数;
 *  连接池创建 createPool()函数
 *  loadDrivers() 装载驱动
 *  createPool() 建连接池
 *  getConnection() 返回一个连接实例
 *  getConnection(long time) 添加时间限制
 *  freeConnection(Connection con) 将 con 连接实例返回到连接池
 *  getnum() 返回空闲连接数
 *  getnumActive() 返回当前使用的连接数
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public abstract class Pool {
    public String propertiesName = "connection-INF.properties";

    /**
     * 定义唯一实例
     */
    private static Pool instance = null;
    /**
     * 最大连接数
     */
    protected int maxConnect = 100;

    /**
     * 保持连接数
     */
    protected int normalConnect = 10;

    /**
     * 驱动字符串
     */
    protected String driverName = null;

    /**
     * 驱动类
     */
    protected Driver driver = null;

    /**
     * 私有构造函数,不允许外界访问
     */
    protected Pool() {
        try {
            init();
            loadDrivers(driverName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *  初始化所有从配置文件中读取的成员变量
     *
     * @throws IOException
     */
    private void init() throws IOException {
        InputStream is = Pool.class.getResourceAsStream(propertiesName);
        Properties p = new Properties();

        p.load(is);

        this.driverName = p.getProperty("driverName");
        this.maxConnect = Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect = Integer.parseInt(p.getProperty("normalConnect"));
    }

    /**
     * 装载和注册所有JDBC驱动程序
     * @param dri  接受驱动字符串
     */
    protected void loadDrivers(String dri) {
        String driverClassName = dri;

        try {
            driver = (Driver) Class.forName(driverClassName).newInstance();
            DriverManager.registerDriver(driver);

            System.out.println("成功注册JDBC驱动程序" + driverClassName);
        } catch (Exception e) {
            System.out.println("无法注册JDBC驱动程序:" + driverClassName + ",错误:" + e);
        }
    }

    /**
     * 创建连接池
     */
    public abstract void createPool();

    /**
     * (单例模式)返回数据库连接池 Pool 的实例
     * @return
     * @throws IOException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     */
    public static synchronized Pool getInstance() throws IOException,
            InstantiationException, IllegalAccessException,
            ClassNotFoundException {
        if (instance == null) {
            instance.init();
            instance = (Pool) Class.forName("org.e_book.sqlhelp.Pool")
                    .newInstance();
        }

        return instance;
    }

    /**
     * 获得一个可用的连接, 如果没有则创建一个连接, 且小于最大连接限制
     * @return
     */
    public abstract Connection getConnection();

    /**
     * 获得一个连接,有时间限制
     * @param time 设置该连接的持续时间(以毫秒为单位)
     * @return
     */
    public abstract Connection getConnection(long time);
}
