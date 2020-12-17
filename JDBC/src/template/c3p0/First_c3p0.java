package template.c3p0;

//c3p0的第一个

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class First_c3p0 {
    public static void main(String[] args) throws SQLException {
        //1.创建数据库连接池对象
        DataSource dataSource = new ComboPooledDataSource();
        //2. 获取连接对象
        Connection connection = dataSource.getConnection();

        //3. 打印
        System.out.println(connection);
    }
}

/*
com.mchange.v2.c3p0.impl.NewProxyConnection@3796751b [wrapping: com.mysql.cj.jdbc.ConnectionImpl@67b64c45]
 */