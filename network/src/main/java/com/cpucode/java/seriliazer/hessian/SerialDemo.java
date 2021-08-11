package com.cpucode.java.seriliazer.hessian;

import com.cpucode.java.seriliazer.ISerializer;
import com.cpucode.java.seriliazer.User;

/**
 * @author : cpucode
 * @date : 2021/8/11
 * @time : 13:22
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SerialDemo {
    public static void main(String[] args) {
        ISerializer iSerializer = new HessianSerializer();

        User user = new User();
        user.setName("cpuCode");
        user.setAge(18);

        byte[] bytes = iSerializer.serialize(user);
        System.out.println("byte.length:" + bytes.length);

        System.out.println(new String(bytes));

        User user1=iSerializer.deserialize(bytes, User.class);
        System.out.println(user1);
    }
}
