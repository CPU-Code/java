package com.cpucode.principle.liskov.substitution.optimization;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 20:41
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface Quadrangle {
    long getWidth();
    long getHeight();

    void setHeight(long height);
    void setWidth(long width);
}
