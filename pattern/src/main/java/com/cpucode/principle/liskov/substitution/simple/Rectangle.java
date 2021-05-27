package com.cpucode.principle.liskov.substitution.simple;

/**
 * 长方形父类
 *
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 20:29
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Rectangle {
    private long height;
    private long width;

    public long getWidth() {
        return width;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
