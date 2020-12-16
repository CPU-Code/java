package jdbc.jdbc;

import jdbc.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 练习：
 * 		* 需求：
 * 			1. 通过键盘录入用户名和密码
 * 			2. 判断用户是否登录成功
 */
public class Login_case {

    public static void main(String[] args){
        //1.键盘录入，接受用户名和密码
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String username = scanner.nextLine();

        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        boolean flag = new Login_case().login(username, password);

        //3.判断结果，输出不同语句
        if (flag){
            System.out.println("登录成功！");
        } else {
            System.out.println("用户名或密码错误！");
        }
    }

    public boolean login(String username , String password){
        if (username == null || password == null){
            return false;
        }

        //连接数据库判断是否登录成功
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = JDBCUtils.getConnection();

            //2.定义sql
            String sql = "select * from user where username = '" + username + "' and password = '" + password + "'";
            System.out.println(sql);

            statement = connection.createStatement();

            resultSet = statement.executeQuery(sql);

            return resultSet.next();    //如果有下一行，则返回true
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, statement, connection);
        }

        return false;
    }
}


/*
请输入用户名：
cc
请输入密码：
111
/D:/Date/github/java/out/production/JDBC/jdbc.properties
select * from user where username = 'cc' and password = '111'
用户名或密码错误！

* */

/*
请输入用户名：
cpucode
请输入密码：
321
/D:/Date/github/java/out/production/JDBC/jdbc.properties
select * from user where username = 'cpucode' and password = '321'
登录成功！
* */


/*

USE cpucode; 			   -- 使用数据库

CREATE TABLE IF NOT EXISTS USER(   -- 创建表
	username VARCHAR(20) NOT NULL,	-- 用户
	PASSWORD VARCHAR(20) NOT NULL 	-- 密码
);

-- 插入数据
INSERT INTO USER VALUES('cpu','123');
INSERT INTO USER VALUES('cpucode','321');
INSERT INTO USER VALUES('哈哈','666');

SELECT * FROM USER;

* */