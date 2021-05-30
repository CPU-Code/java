package com.cpucode.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *  CGLib 代理的使用,还是以媒婆为例
 *
 * @author : cpucode
 * @date : 2021/5/30
 * @time : 16:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CglibMeipo implements MethodInterceptor {
    public Object getInstance(Class<?> clazz) throws Exception{
        Enhancer enhancer = new Enhancer();

        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务的增强
        before();

        Object obj = methodProxy.invokeSuper(o, objects);

        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆： 我要给你找对象， 现在已经拿到你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("如果合适的话， 就准备办事");
    }
}
