package com.cpucode.java.seriliazer.fast.json;

import com.alibaba.fastjson.JSON;
import com.cpucode.java.seriliazer.ISerializer;

/**
 * @author : cpucode
 * @date : 2021/8/11
 * @time : 11:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class FastJsonSeriliazer implements ISerializer {
    @Override
    public <T> byte[] serialize(T obj) {
        return JSON.toJSONString(obj).getBytes();
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clazz) {
        return (T)JSON.parseObject(new String(data), clazz);
    }
}
