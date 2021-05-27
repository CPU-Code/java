package com.cpucode.principle.liskov.substitution.optimization;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 20:43
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Square implements Quadrangle{
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return length;
    }

    @Override
    public long getHeight() {
        return length;
    }

    @Override
    public void setHeight(long height) {

    }

    @Override
    public void setWidth(long width) {

    }
}
