package com.cpucode.java.seriliazer.file;

import com.cpucode.java.seriliazer.ISerializer;
import com.cpucode.java.seriliazer.User;
import com.cpucode.java.seriliazer.java.serilia.JavaSerializer;

/**
 * @author : cpucode
 * @date : 2021/8/10
 * @time : 10:52
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SerialDemo {
    public static void main(String[] args) {
        ISerializer serializer = new JavaSerializerWithFile();

        // JVM内存中.  如何把内存中的对象进行网络传输.(实体)->字节序列
        User user = new User();
        user.setName("cpuCode");
        user.setAge(18);

        byte[] bytes = serializer.serialize(user);
        System.out.println("byte.length : " + bytes.length);
        System.out.println(new String(bytes));

        User user1 = serializer.deserialize(bytes, User.class);

        System.out.println(user1);
    }
}
