package com.cpucode.java.loader;

import java.io.*;

/**
 * @author : cpucode
 * @date : 2021/2/3
 * @time : 16:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserClassLoader extends ClassLoader{
    private String rootDir;

    public static void main(String[] args) {
        String rootDir = "D:\\Date\\github\\java\\JVM\\src\\";

        try{
            //创建自定义的类的加载器1
            UserClassLoader loader1 = new UserClassLoader(rootDir);
            Class clazz1 = loader1.findClass("com.cpucode.java.loader.User");

            //创建自定义的类的加载器2
            UserClassLoader loader2 = new UserClassLoader(rootDir);
            Class clazz2 = loader2.findClass("com.cpucode.java.loader.User");

            System.out.println(clazz1.getClassLoader());
            System.out.println(clazz2.getClassLoader());

            //clazz1与clazz2对应了不同的类模板结构
            System.out.println(clazz1 == clazz2);

            /*****************************************************/

            Class clazz3 = ClassLoader.getSystemClassLoader().loadClass("com.cpucode.java.loader.User");
            System.out.println(clazz3.getClassLoader());

            System.out.println(clazz1.getClassLoader().getParent());
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        /**
         * com.cpucode.java.loader.UserClassLoader@330bedb4
         * com.cpucode.java.loader.UserClassLoader@4b67cf4d
         * false
         * sun.misc.Launcher$AppClassLoader@18b4aac2
         * sun.misc.Launcher$AppClassLoader@18b4aac2
         * */
    }

    public UserClassLoader(String rootDir){
        this.rootDir = rootDir;
    }

    /**
     * 编写findClass方法的逻辑
     * */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException{
        // 获取类的class文件字节数组
        byte[] classData = getClassData(name);

        if (classData == null){
            throw new ClassNotFoundException();
        }else {
            //直接生成class对象
            return defineClass(name, classData, 0, classData.length);
        }
    }

    /**
     * 编写获取class文件并转换为字节码流的逻辑
     * */
    private byte[] getClassData(String className){
        // 读取类文件的字节
        String path = classNameToPath(className);

        try{
            InputStream ins = new FileInputStream(path);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];

            int len = 0;

            // 读取类文件的字节码
            while ((len = ins.read(buffer)) != -1){
                baos.write(buffer, 0, len);
            }

            return baos.toByteArray();

        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 类文件的完全路径
     * */
    private String classNameToPath(String className){
        return rootDir + "\\" + className.replace('.', '\\') + ".class";
    }
}
