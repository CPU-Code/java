package com.cpucode.java.loader;

/**
 * @author : cpucode
 * @date : 2021/2/4
 * @time : 20:54
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GetClassLoader {
    public static void main(String[] args) {
        //获取系统该类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);

        //试图获取引导类加载器：失败
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);

        /*******************************/

        try{
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            //自定义的类默认使用系统类加载器
            ClassLoader classLoader1 = Class.forName("com.cpucode.java.loader.GetClassLoader").getClassLoader();
            System.out.println(classLoader1);

            //关于数组类型的加载:使用的类的加载器与数组元素的类的加载器相同

            String[] arrStr = new String[5];
            //null:表示使用的是引导类加载器
            System.out.println(arrStr.getClass().getClassLoader());

            GetClassLoader[] arr1 = new GetClassLoader[5];
            System.out.println(arr1.getClass().getClassLoader());

            int[] arr2 = new int[5];
            //null:不需要类的加载器
            System.out.println(arr2.getClass().getClassLoader());

            System.out.println(Thread.currentThread().getContextClassLoader());
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

/**
 * sun.misc.Launcher$AppClassLoader@18b4aac2
 * sun.misc.Launcher$ExtClassLoader@330bedb4
 * null
 * null
 * sun.misc.Launcher$AppClassLoader@18b4aac2
 * null
 * sun.misc.Launcher$AppClassLoader@18b4aac2
 * null
 * sun.misc.Launcher$AppClassLoader@18b4aac2
 * */