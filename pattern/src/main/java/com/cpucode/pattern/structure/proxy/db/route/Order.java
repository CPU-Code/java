package com.cpucode.pattern.structure.proxy.db.route;

/**
 *  Order 订单实体
 *
 * @author : cpucode
 * @date : 2021/5/29
 * @time : 23:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Order {
    private Object orderInfo;
    /**
     * 订单创建时间进行按年分库
     */
    private Long createTime;
    private String id;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
