package com.cpucode.pattern.factory.abstractfactory;

/**
 * 抽象工厂是用户的主入口
 * 在 Spring 中应用得最为广泛的一种设计模式
 * 易于扩展
 *
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:41
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface CourseFactory {
    Note createNote();
    Video createVideo();
}
