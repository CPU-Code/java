package com.cpucode.java.loader;

import java.lang.reflect.Method;

/**
 * @author : cpucode
 * @date : 2021/2/4
 * @time : 22:52
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LoopRun {
    public static void main(String[] args) {
        while (true){
            try {
                //1. 创建自定义类加载器的实例
                MyClassLoader loader = new MyClassLoader("D:\\Date\\github\\java\\JVM\\src\\");
                //2. 加载指定的类
                Class clazz = loader.findClass("com.cpucode.java.loader.Demo");
                //3. 创建运行时类的实例
                Object demo = clazz.newInstance();

                //4. 获取运行时类中指定的方法
                Method m = clazz.getMethod("hot");
                //5. 调用指定的方法
                m.invoke(demo);

                Thread.sleep(5000);
            }catch (Exception e){
                System.out.println("not find");

                try{
                    Thread.sleep(3000);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
