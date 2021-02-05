package com.cpucode.java.loader;

/**
 * @author : cpucode
 * @date : 2021/2/5
 * @time : 13:09
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class OverrideClassLoaderTest {
    public static void main(String[] args) {
        OverrideClassLoader loader = new OverrideClassLoader("D:/Date/github/java/JVM/src/com/cpucode/java/loader/");

        try{
            Class clazz = loader.loadClass("Demo");

            System.out.println("加载此类的类的加载器为：" + clazz.getClassLoader().getClass().getName());

            System.out.println("加载当前Demo类的类的加载器的父类加载器为：" + clazz.getClassLoader().getParent());
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

/**
 * 加载此类的类的加载器为：com.cpucode.java.loader.OverrideClassLoader
 * 加载当前Demo类的类的加载器的父类加载器为：sun.misc.Launcher$AppClassLoader@18b4aac2
 * */