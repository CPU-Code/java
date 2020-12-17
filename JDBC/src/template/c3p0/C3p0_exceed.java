package template.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3p0_exceed {
    public static void main(String[] args) throws SQLException {
        //1. 获取DataSource，使用默认配置
        DataSource dataSource = new ComboPooledDataSource();
        DataSource dataSource1 = new ComboPooledDataSource();
        for (int i = 1; i <= 6; i++){
            Connection connection = dataSource.getConnection();
            System.out.println(i + ":" + connection);

            if (i == 3){
                //归还连接到连接池中
                connection.close();
            }
        }

        System.out.println("下面超过最大连接 :　");

        for (int i = 1; i <= 6; i++){
            Connection connection1 = dataSource1.getConnection();
            System.out.println(i + ":" + connection1);
        }
    }
}

/*
1:com.mchange.v2.c3p0.impl.NewProxyConnection@7f690630 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@edf4efb]
2:com.mchange.v2.c3p0.impl.NewProxyConnection@566776ad [wrapping: com.mysql.cj.jdbc.ConnectionImpl@6108b2d7]
3:com.mchange.v2.c3p0.impl.NewProxyConnection@6bf256fa [wrapping: com.mysql.cj.jdbc.ConnectionImpl@6cd8737]
4:com.mchange.v2.c3p0.impl.NewProxyConnection@3498ed [wrapping: com.mysql.cj.jdbc.ConnectionImpl@6cd8737]
5:com.mchange.v2.c3p0.impl.NewProxyConnection@3d8c7aca [wrapping: com.mysql.cj.jdbc.ConnectionImpl@5ebec15]
6:com.mchange.v2.c3p0.impl.NewProxyConnection@380fb434 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@668bc3d5]
下面超过最大连接 :　
十二月 17, 2020 11:08:26 上午 com.mchange.v2.c3p0.impl.AbstractPoolBackedDataSource
信息: Initializing c3p0 pool... com.mchange.v2.c3p0.ComboPooledDataSource [ acquireIncrement -> 3, acquireRetryAttempts -> 30, acquireRetryDelay -> 1000, autoCommitOnClose -> false, automaticTestTable -> null, breakAfterAcquireFailure -> false, checkoutTimeout -> 2000, connectionCustomizerClassName -> null, connectionTesterClassName -> com.mchange.v2.c3p0.impl.DefaultConnectionTester, contextClassLoaderSource -> caller, dataSourceName -> 1hge3ghaeupgb7p1sjaulv|6adca536, debugUnreturnedConnectionStackTraces -> false, description -> null, driverClass -> com.mysql.jdbc.Driver, extensions -> {}, factoryClassLocation -> null, forceIgnoreUnresolvedTransactions -> false, forceSynchronousCheckins -> false, forceUseNamedDriverClass -> false, identityToken -> 1hge3ghaeupgb7p1sjaulv|6adca536, idleConnectionTestPeriod -> 0, initialPoolSize -> 3, jdbcUrl -> jdbc:mysql:///cpucode?serverTimezone=UTC, maxAdministrativeTaskTime -> 0, maxConnectionAge -> 0, maxIdleTime -> 0, maxIdleTimeExcessConnections -> 0, maxPoolSize -> 5, maxStatements -> 0, maxStatementsPerConnection -> 0, minPoolSize -> 3, numHelperThreads -> 3, preferredTestQuery -> null, privilegeSpawnedThreads -> false, properties -> {user=******, password=******}, propertyCycle -> 0, statementCacheNumDeferredCloseThreads -> 0, testConnectionOnCheckin -> false, testConnectionOnCheckout -> false, unreturnedConnectionTimeout -> 0, userOverrides -> {}, usesTraditionalReflectiveProxies -> false ]
1:com.mchange.v2.c3p0.impl.NewProxyConnection@73f792cf [wrapping: com.mysql.cj.jdbc.ConnectionImpl@2ed94a8b]
2:com.mchange.v2.c3p0.impl.NewProxyConnection@dfd3711 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@42d3bd8b]
3:com.mchange.v2.c3p0.impl.NewProxyConnection@5f2050f6 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@3b81a1bc]
4:com.mchange.v2.c3p0.impl.NewProxyConnection@13fee20c [wrapping: com.mysql.cj.jdbc.ConnectionImpl@4e04a765]
5:com.mchange.v2.c3p0.impl.NewProxyConnection@17550481 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@735f7ae5]
Exception in thread "main" java.sql.SQLException: An attempt by a client to checkout a Connection has timed out.
* */