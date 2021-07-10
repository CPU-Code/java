package com.cpucode.pattern.structure.proxy.db.route;

/**
 *  OrderDao 持久层操作类
 *
 * @author : cpucode
 * @date : 2021/5/29
 * @time : 23:17
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功!");

        return 1;
    }
}
