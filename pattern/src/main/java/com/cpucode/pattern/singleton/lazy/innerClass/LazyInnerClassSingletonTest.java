package com.cpucode.pattern.singleton.lazy.innerClass;

import java.lang.reflect.Constructor;

/**
 * 反射破坏单例
 *
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 11:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {

        try {
            Class<?> clazz = LazyInnerClassSingleton.class;

            //通过反射拿到私有的构造方法
            Constructor<?> c = c = clazz.getDeclaredConstructor(null);

            //强制访问， 强吻， 不愿意也要吻
            c.setAccessible(true);
            //暴力初始化
            Object o1 = c.newInstance();

            //调用了两次构造方法， 相当于 new 了两次 , 犯了原则性问题
            Object o2 = c.newInstance();

            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
