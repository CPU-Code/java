package jdbc;

//登录方法,使用PreparedStatement实现

import util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login_pre_case {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String username = scanner.nextLine();

        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        boolean flag = new Login_pre_case().login(username, password);

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
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        //1.获取连接
        try {
            connection = JDBCUtils.getConnection();

            //2.定义sql
            String sql = "select * from user where username = ? and password = ?";
            //3.获取执行sql的对象
            preparedStatement = connection.prepareStatement(sql);

            //给?赋值
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            //4.执行查询,不需要传递sql
            resultSet = preparedStatement.executeQuery();

            //如果有下一行，则返回true
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, preparedStatement, connection);
        }

        return false;
    }
}

/*
请输入用户名：
dd
请输入密码：
11
/D:/Date/github/java/out/production/JDBC/jdbc.properties
用户名或密码错误！
* */

/*
请输入用户名：
cpu
请输入密码：
123
/D:/Date/github/java/out/production/JDBC/jdbc.properties
登录成功！
* */