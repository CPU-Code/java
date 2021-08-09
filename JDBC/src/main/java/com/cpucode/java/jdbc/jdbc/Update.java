package com.cpucode.java.jdbc.jdbc;

// 表 修改记录

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[] args){
        Connection connection = null;
        Statement statement = null;

        //1. 注册驱动
        //Class.forName("com.mysql.jdbc.Driver");

        try {
            //2.获取连接对象
            connection = DriverManager.getConnection("jdbc:mysql:///cpucode?serverTimezone=UTC",
                    "root","12345");

            //3.定义sql
            String sql = "update student set name = 'cpucode' where id = 3";

            //4.获取执行sql对象
            statement = connection.createStatement();
            //5.执行sql
            int count = statement.executeUpdate(sql);

            //6.处理结果
            System.out.println("count =" + count);
            if (count > 0){
                System.out.println("修改成功！!!");
            } else {
                System.out.println("修改失败");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            //7.释放资源
            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null)
            {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

/*
count =1
修改成功！!!
* */