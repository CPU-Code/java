package com.cpucode.java.loader;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/**
 * 自定义类的加载器
 *
 * @author : cpucode
 * @date : 2021/2/4
 * @time : 22:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MyClassLoader extends ClassLoader{
    private String rootDir;

    public MyClassLoader(String rootDir){
        this.rootDir = rootDir;
    }

    @Override
    protected Class<?> findClass(String className){
        Class clazz = this.findLoadedClass(className);
        FileChannel fileChannel = null;
        WritableByteChannel outChannel = null;

        if (null == clazz){
            try{
                String classFile = getClassFile(className);

                FileInputStream fis = new FileInputStream(classFile);
                fileChannel = fis.getChannel();

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                outChannel = Channels.newChannel(baos);

                ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

                while (true){
                    int i = fileChannel.read(buffer);
                    if (i == 0 || i == -1){
                        break;
                    }

                    buffer.flip();
                    outChannel.write(buffer);
                    buffer.clear();
                }

                byte[] bytes = baos.toByteArray();
                clazz = defineClass(className, bytes, 0, bytes.length);

            } catch (FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }finally{
                try{
                    if(fileChannel != null){
                        fileChannel.close();
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }

                try{
                    if(outChannel != null){
                        outChannel.close();
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

        return clazz;

    }

    /**
     * 类文件的完全路径
     * */
    private String getClassFile(String className){
        return rootDir + "\\" + className.replace('.','\\') + ".class";
    }
}
