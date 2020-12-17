package template.druid;

//完成添加操作：给student表添加一条记录

import jdbc.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Druid_data {
    public static void main(String[] args){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            //1.获取连接
            connection = JDBCUtils.getConnection();
            //2.定义sql
            String sql = "insert into student values(null, ?, ?)";
            //3.获取pstmt对象r
            preparedStatement = connection.prepareStatement(sql);
            //4.给？赋值
            preparedStatement.setString(1, "哈哈");
            preparedStatement.setInt(2,29);
            //5.执行sql
            int count = preparedStatement.executeUpdate();

            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //6. 释放资源
            JDBCUtils.close(preparedStatement, connection);
        }
    }
}
