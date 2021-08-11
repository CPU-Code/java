package com.cpucode.java.seriliazer.hessian;

import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;
import com.cpucode.java.seriliazer.ISerializer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author : cpucode
 * @date : 2021/8/11
 * @time : 11:52
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class HessianSerializer implements ISerializer {
    @Override
    public <T> byte[] serialize(T obj) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        HessianOutput hessianOutput = new HessianOutput(outputStream);

        try {
            hessianOutput.writeObject(obj);

            return outputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new byte[0];
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clazz) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
        HessianInput hessianInput = new HessianInput(inputStream);

        try {
            return (T)hessianInput.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
