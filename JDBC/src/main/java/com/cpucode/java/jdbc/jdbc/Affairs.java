package com.cpucode.java.jdbc.jdbc;

import com.cpucode.java.jdbc.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//事务操作
public class Affairs {
    public static void main(String[] args){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement1 = null;

        try {
            connection = JDBCUtils.getConnection();

            connection.setAutoCommit(false);

            String sql = "update account set balance = balance - ? where id = ?";
            String sql1 = "update account set balance = balance + ? where id = ?";

            //3.获取执行sql对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement1 = connection.prepareStatement(sql1);

            preparedStatement.setDouble(1, 100);
            preparedStatement.setInt(2, 1);

            preparedStatement1.setDouble(1, 100);
            preparedStatement1.setInt(2, 2);

            preparedStatement.executeUpdate();
            // 手动制造异常
            int i = 3/0;

            preparedStatement1.executeUpdate();

            //提交事务
            connection.commit();
        } catch (Exception e) {
            if (connection != null){
                try {
                    connection.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(preparedStatement, connection);
            JDBCUtils.close(preparedStatement1, connection);
        }
    }
}

/*

/D:/Date/github/java/out/production/JDBC/jdbc.properties
java.lang.ArithmeticException: / by zero
	at jdbc.Affairs.main(Affairs.java:36)

* */

/*

USE cpucode; 			   -- 使用数据库

CREATE TABLE IF NOT EXISTS account(   -- 创建表
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20) NOT NULL,
	balance DOUBLE NOT NULL 	-- 密码
);

-- 插入数据
INSERT INTO account VALUES(NULL,'cpu', 500);
INSERT INTO account VALUES(NULL,'cpucode', 500);
INSERT INTO account VALUES(NULL,'哈哈',999);

SELECT * FROM account;

* */