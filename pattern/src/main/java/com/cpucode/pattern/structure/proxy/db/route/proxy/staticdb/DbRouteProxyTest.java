package com.cpucode.pattern.structure.proxy.db.route.proxy.staticdb;

import com.cpucode.pattern.structure.proxy.db.route.IOrderService;
import com.cpucode.pattern.structure.proxy.db.route.Order;
import com.cpucode.pattern.structure.proxy.db.route.OrderService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : cpucode
 * @date : 2021/5/29
 * @time : 23:33
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2021/02/01");

            order.setCreateTime(date.getTime());

            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
