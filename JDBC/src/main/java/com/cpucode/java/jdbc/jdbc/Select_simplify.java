package com.cpucode.java.jdbc.jdbc;

import java.sql.*;

public class Select_simplify {
    public static void main(String[] args){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

/*        try {
            //1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        try {
            //2.获取连接对象
            connection = DriverManager.getConnection("jdbc:mysql:///cpucode?serverTimezone=UTC",
                    "root", "12345");

            //3.定义sql
            String sql = "select * from student";
            //4.获取执行sql对象
            statement = connection.createStatement();
            //5.执行sql
            resultSet = statement.executeQuery(sql);
            //6.处理结果
            //循环判断游标是否是最后一行末尾。
            while(resultSet.next()){
                //获取数据
                //6.2 获取数据
                int id  = resultSet.getInt(1);
                String name = resultSet.getString("name");
                int age = resultSet.getInt(3);

                System.out.println("id = " + id + "---name = " + name + "----age = " + age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}


/*
id = 1---name = CPU----age = 30
id = 2---name = cpucode----age = 12
id = 4---name = cpu----age = 44
id = 5---name = 哇哇----age = 25
id = 6---name = 哇哇----age = 25
* */