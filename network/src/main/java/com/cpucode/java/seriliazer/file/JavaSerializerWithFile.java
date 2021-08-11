package com.cpucode.java.seriliazer.file;

import com.cpucode.java.seriliazer.ISerializer;

import java.io.*;

/**
 * @author : cpucode
 * @date : 2021/8/10
 * @time : 11:03
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JavaSerializerWithFile implements ISerializer {

    @Override
    public <T> byte[] serialize(T obj) {
        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream(new File("user")));

            out.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clazz) {
        try {
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream(new File("user")));

            return (T) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
