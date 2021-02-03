package com.cpucode.java.loader;

/**
 * @author : cpucode
 * @date : 2021/2/3
 * @time : 16:05
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserTest {

    public static void main(String[] args) {
        //隐式加载
        User user = new User();

        try{
            //显式加载
            Class clazz = Class.forName("com.cpucode.java.loader.User");

            //显式加载
            ClassLoader.getSystemClassLoader().loadClass("com.cpucode.java.loader.User");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
