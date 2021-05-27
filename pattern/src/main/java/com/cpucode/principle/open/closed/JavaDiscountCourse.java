package com.cpucode.principle.open.closed;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 19:17
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    /**
     * 在不修改原有代码前提前下，实现价格优惠这个功能
     * @return
     */
    @Override
    public Double getPrice(){
        return super.getPrice() * 0.61;
    }
}
