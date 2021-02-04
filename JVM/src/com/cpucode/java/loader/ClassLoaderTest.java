package com.cpucode.java.loader;

import java.net.URL;

/**
 * @author : cpucode
 * @date : 2021/2/4
 * @time : 19:57
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        System.out.println("***********启动类加载器************");

        //获取BootstrapClassLoader能够加载的api的路径
        URL[] usrls = sun.misc.Launcher.getBootstrapClassPath().getURLs();

        for (URL element : usrls){
            System.out.println(element.toExternalForm());
        }

        //从上面的路径中随意选择一个类,来看看他的类加载器是什么:引导类加载器
        ClassLoader classLoader = java.security.Provider.class.getClassLoader();
        System.out.println(classLoader);

        /***********************************************************/

        System.out.println("***********扩展类加载器**************");
        
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")){
            System.out.println(path);
        }

        //从上面的路径中随意选择一个类,来看看他的类加载器是什么:扩展类加载器
        ClassLoader classLoader1 = sun.security.ec.CurveDB.class.getClassLoader();
        System.out.println(classLoader1);
    }
}

/**
 * ***********启动类加载器************
 * file:/D:/Program%20Files/Java/jdk8u272-b10/jre/lib/resources.jar
 * file:/D:/Program%20Files/Java/jdk8u272-b10/jre/lib/rt.jar
 * file:/D:/Program%20Files/Java/jdk8u272-b10/jre/lib/sunrsasign.jar
 * file:/D:/Program%20Files/Java/jdk8u272-b10/jre/lib/jsse.jar
 * file:/D:/Program%20Files/Java/jdk8u272-b10/jre/lib/jce.jar
 * file:/D:/Program%20Files/Java/jdk8u272-b10/jre/lib/charsets.jar
 * file:/D:/Program%20Files/Java/jdk8u272-b10/jre/lib/jfr.jar
 * file:/D:/Program%20Files/Java/jdk8u272-b10/jre/classes
 * null
 * ***********扩展类加载器**************
 * D:\Program Files\Java\jdk8u272-b10\jre\lib\ext
 * C:\Windows\Sun\Java\lib\ext
 * sun.misc.Launcher$ExtClassLoader@12a3a380
 * */