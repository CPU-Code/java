package com.cpucode.principle.composite.reuse.optimization;

/**
 * 尽量使用对象组合(has-a)/聚合(contanis-a)，而不是继承关系达到软件复用的目的
 *
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 21:00
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public abstract class DbConnection {
    public abstract String getConnection();
}
