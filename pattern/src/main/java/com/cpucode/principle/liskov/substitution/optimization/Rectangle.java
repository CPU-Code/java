package com.cpucode.principle.liskov.substitution.optimization;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 20:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Rectangle implements Quadrangle{
    private long height;
    private long width;

    @Override
    public void setHeight(long height) {
        this.height = height;
    }

    @Override
    public void setWidth(long width) {
        this.width = width;
    }

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getHeight() {
        return height;
    }
}
