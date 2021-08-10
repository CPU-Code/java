package com.cpucode.java.seriliazer;

/**
 * @author : cpucode
 * @date : 2021/8/10
 * @time : 10:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface ISerializer {
    <T> byte[] serialize(T obj);
    <T> T deserialize(byte[] data,Class<T> clazz);
}
