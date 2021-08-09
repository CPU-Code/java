package com.cpucode.java.spring.orm.framework;

/**
 * sql 排序组件
 *
 * @author : cpucode
 * @date : 2021/8/9
 * @time : 14:53
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Order {
    /**
     * 升序还是降序
     */
    private boolean ascending;
    /**
     * 哪个字段升序， 哪个字段降序
     */
    private String propertyName;

    protected Order(String propertyName, boolean ascending) {
        this.propertyName = propertyName;
        this.ascending = ascending;
    }

    @Override
    public String toString() {
        return propertyName + ' ' + (ascending ? "asc" : "desc");
    }

    public static Order asc(String propertyName) {
        return new Order(propertyName, true);
    }

    public static Order desc(String propertyName) {
        return new Order(propertyName, false);
    }

}
