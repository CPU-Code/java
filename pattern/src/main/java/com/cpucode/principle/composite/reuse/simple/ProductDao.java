package com.cpucode.principle.composite.reuse.simple;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 20:59
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ProductDao {
    private DbConnection dbConnection;

    public void setDbConnection(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}
