package com.cpucode.pattern.proxy.db.route.proxy.staticdb;

import com.cpucode.pattern.proxy.db.route.IOrderService;
import com.cpucode.pattern.proxy.db.route.Order;
import com.cpucode.pattern.proxy.db.route.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : cpucode
 * @date : 2021/5/29
 * @time : 23:24
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class OrderServiceStaticProxy implements IOrderService {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(){}

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        before();

        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));

        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】 数据源处理数据。 ");

        DynamicDataSourceEntity.set(dbRouter);
        this.orderService.createOrder(order);
        DynamicDataSourceEntity.restore();

        after();

        return 0;
    }

    private void before(){
        System.out.println("Proxy before method.");
    }

    private void after(){
        System.out.println("Proxy after method.");
    }
}
