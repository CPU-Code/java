package com.cpucode.java.seriliazer.java.serilia;

import com.cpucode.java.seriliazer.ISerializer;

import java.io.*;

/**
 * @author : cpucode
 * @date : 2021/8/10
 * @time : 10:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JavaSerializer implements ISerializer {

    @Override
    public <T> byte[] serialize(T obj) {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();

        try{
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(obj);

            return byteOut.toByteArray();
        }catch (IOException e){
            e.printStackTrace();
        }

        return new byte[0];
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clazz) {
        ByteArrayInputStream byteIn = new ByteArrayInputStream(data);

        try {
            ObjectInputStream in = new ObjectInputStream(byteIn);

            return (T) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
