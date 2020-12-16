package jdbc.jdbc;

import java.sql.*;

public class Select {
    public static void main(String[] args){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
/*
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        */

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
            //6.1 让游标向下移动一行
            resultSet.next();
            //6.2 获取数据
            int id = resultSet.getInt(1);
            String name = resultSet.getString("name");
            int age = resultSet.getInt(3);

            System.out.println("id = " + id + "-- name = " + name + "-- age = " + age);

            //6.1 让游标向下移动一行
            resultSet.next();
            //6.2 获取数据
            int id2 = resultSet.getInt(1);
            String name2 = resultSet.getString("name");
            int age2 = resultSet.getInt(3);

            System.out.println("id = " + id2 + "-- name = " + name2 + "-- age = " + age2);

            //6.1 让游标向下移动一行
            resultSet.next();
            //6.2 获取数据
            int id3 = resultSet.getInt(1);
            String name3 = resultSet.getString("name");
            int age3 = resultSet.getInt(3);

            System.out.println("id = " + id3 + "-- name = " + name3 + "-- age = " + age3);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
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
id = 1-- name = CPU-- age = 30
id = 2-- name = cpucode-- age = 12
id = 4-- name = cpu-- age = 44
* */