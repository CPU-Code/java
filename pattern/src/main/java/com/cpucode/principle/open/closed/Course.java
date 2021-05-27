package com.cpucode.principle.open.closed;

/**
 * 课程体系为例，创建一个课程接口
 *
 *  开闭原则（Open-Closed Principle, OCP）:
 *      指一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。
 *      所谓的开闭，也正是对扩展和修改两个行为的一个原则。
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 17:52
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface Course {
    /**
     * 课程编号
     * @return
     */
    Integer getId();

    /**
     * 课程名字
     * @return
     */
    String getName();

    /**
     * 价格
     * @return
     */
    Double getPrice();
}
