package jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_table {
    public static void main(String[] args){
        Connection connection = null;
        Statement statement = null;
        //1. 注册驱动
/*        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        try {
            //2.获取连接对象
            connection = DriverManager.getConnection("jdbc:mysql:///cpucode?serverTimezone=UTC",
                    "root","12345");
            //3.定义sql
            String sql = "create table if not exists cpucode (id int, name varchar(20))";

            //4.获取执行sql对象
            statement = connection.createStatement();

            //5.执行sql
            int count = statement.executeUpdate(sql);
            //6.处理结果
            System.out.println("count = " + count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //7.释放资源
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
count = 0
* */