package com.cpucode.java.loader;

import java.io.*;

/**
 * 自定义ClassLoader
 *
 * @author : cpucode
 * @date : 2021/2/5
 * @time : 11:28
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class OverrideClassLoader extends ClassLoader{
    private String byteCodePath;

    public OverrideClassLoader(String byteCodePath){
        this.byteCodePath = byteCodePath;
    }

    public OverrideClassLoader(ClassLoader parent, String byteCodePath){
        super(parent);
        this.byteCodePath = byteCodePath;
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException{
        BufferedInputStream bis = null;
        ByteArrayOutputStream baos = null;

        try{
            //获取字节码文件的完整路径
            String fileName = byteCodePath + className + ".class";

            //获取一个输入流
            bis = new BufferedInputStream(new FileInputStream(fileName));

            //获取一个输出流
            baos = new ByteArrayOutputStream();

            //具体读入数据并写出的过程
            int len;
            byte[] data = new byte[1024];
            while ((len = bis.read(data)) != -1){
                baos.write(data, 0, len);
            }

            //获取内存中的完整的字节数组的数据
            byte[] byteCodes = baos.toByteArray();
            //调用defineClass()，将字节数组的数据转换为Class的实例
            Class clazz = defineClass(null, byteCodes, 0, byteCodes.length);

            return clazz;
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (baos != null){
                    baos.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }

            try{
                if (bis != null){
                    bis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        return null;
    }
}
