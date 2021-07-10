package com.cpucode.pattern.structure.proxy.dynamicproxy.gpproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author : cpucode
 * @date : 2021/5/30
 * @time : 12:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GPClassLoader extends ClassLoader {
    private File classPathFile;

    public GPClassLoader(){
        String classPath = GPClassLoader.class.getResource("").getPath();

        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String className = GPClassLoader.class.getPackage().getName() + "." + name;

        if(classPathFile  != null){
            File classFile = new File(classPathFile,
                    name.replaceAll("\\.","/") + ".class");

            if(classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;

                try{
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();

                    byte [] buff = new byte[1024];
                    int len;

                    while ((len = in.read(buff)) != -1){
                        out.write(buff,0,len);
                    }

                    return defineClass(className, out.toByteArray(), 0, out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        return null;
    }
}
