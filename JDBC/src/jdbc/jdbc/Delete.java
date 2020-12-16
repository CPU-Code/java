package jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args){
        Statement statement = null;
        Connection connection = null;
/*
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
*/

        try {
            connection = DriverManager.getConnection("jdbc:mysql:///cpucode?serverTimezone=UTC",
                    "root", "12345");

            String sql = "delete from student where id = 3";

            statement = connection.createStatement();

            int count = statement.executeUpdate(sql);

            System.out.println("count = " + count);

            if (count > 0){
                System.out.println("删除成功！");
            } else{
                System.out.println("删除失败!!");
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
删除成功!
* */