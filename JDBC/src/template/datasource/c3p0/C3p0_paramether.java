package template.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3p0_paramether {
    public static void main(String[] args) throws SQLException {
        // 1.1 获取DataSource，使用指定名称配置
        DataSource dataSource = new ComboPooledDataSource("otherc3p0");

        //2.获取连接
        for (int i = 1; i <= 8; i++){
            Connection connection = dataSource.getConnection();

            System.out.println(i + ":" + connection);
        }
    }

}

/*
1:com.mchange.v2.c3p0.impl.NewProxyConnection@3796751b [wrapping: com.mysql.cj.jdbc.ConnectionImpl@67b64c45]
2:com.mchange.v2.c3p0.impl.NewProxyConnection@6442b0a6 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@60f82f98]
3:com.mchange.v2.c3p0.impl.NewProxyConnection@7f690630 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@edf4efb]
4:com.mchange.v2.c3p0.impl.NewProxyConnection@566776ad [wrapping: com.mysql.cj.jdbc.ConnectionImpl@6108b2d7]
5:com.mchange.v2.c3p0.impl.NewProxyConnection@6bf256fa [wrapping: com.mysql.cj.jdbc.ConnectionImpl@6cd8737]
6:com.mchange.v2.c3p0.impl.NewProxyConnection@13969fbe [wrapping: com.mysql.cj.jdbc.ConnectionImpl@6aaa5eb0]
7:com.mchange.v2.c3p0.impl.NewProxyConnection@1a407d53 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@3d8c7aca]
8:com.mchange.v2.c3p0.impl.NewProxyConnection@21bcffb5 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@380fb434]

* */

