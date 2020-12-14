package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// 表 添加一条记录 insert 语句
public class Insert {
    public static void main(String[] args){
        Statement statement = null;
        Connection connection = null;

        try {
            //1. 注册驱动
            //Class.forName("com.mysql.jdbc.Driver");

            //2. 定义sql
            String sql = "insert into student values(null, '哇哇' , 25)";

            //3.获取Connection对象
            connection = DriverManager.getConnection("jdbc:mysql:///cpucode?serverTimezone=UTC",
                    "root", "12345");

            //4.获取执行sql的对象 Statement
            statement = connection.createStatement();

            //5.执行sql
            int count = statement.executeUpdate(sql);       //影响的行数

            //6.处理结果
            System.out.println("count = " + count);

            if (count > 0){
                System.out.println("添加成功!!");
            } else {
                System.out.println("添加失败!!!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //7. 释放资源
            //避免空指针异常
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
count = 1
添加成功!!
* */