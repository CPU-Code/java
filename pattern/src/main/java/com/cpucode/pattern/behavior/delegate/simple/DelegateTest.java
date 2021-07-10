package com.cpucode.pattern.behavior.delegate.simple;

/**
 * 客户请求（Boss） 、 委派者（Leader） 、 被被委派者（Target）
 *
 * 委派者要持有被委派者的引用
 * 代理模式注重的是 过程
 * 委派模式注重的是 结果
 *
 * 策略模式注重是 可扩展（外部扩展）
 * 委派模式注重 内部的灵活和复用
 *
 * 委派的核心： 就是分发、 调度、 派遣
 * 委派模式： 就是静态代理和策略模式一种特殊的组合
 *
 * @author : cpucode
 * @date : 2021/5/30
 * @time : 21:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("登录", new Leader());
    }
}
