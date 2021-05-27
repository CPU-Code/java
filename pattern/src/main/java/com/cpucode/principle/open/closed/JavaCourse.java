package com.cpucode.principle.open.closed;

/**
 * 整个课程生态有 Java 架构、大数据等，我们来创建一个 Java架构课程的类
 *
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 17:57
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JavaCourse implements Course{
    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
