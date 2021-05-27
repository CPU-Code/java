package com.cpucode.principle.liskov.substitution.simple;

/**
 * 正方形 Square 类继承长方形
 *
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 20:32
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Square extends Rectangle {
    private long length;

    public void setLength(long length) {
        this.length = length;
    }
    public long getLength() {
        return this.length;
    }

    @Override
    public long getWidth() {
        return getLength();
    }

    @Override
    public long getHeight() {
        return getLength();
    }

    @Override
    public void setHeight(long height) {
        setLength(height);
    }

    @Override
    public void setWidth(long width) {
        setLength(width);
    }
}
