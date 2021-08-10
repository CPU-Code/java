package com.cpucode.java.seriliazer.proto.buf;


/**
 * @author : cpucode
 * @date : 2021/8/10
 * @time : 10:02
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ProtoBufDemo {
    public static void main(String[] args) {
        UserProtos.User user = UserProtos.User.newBuilder()
                .setAge(18)
                .setName("cpuCode")
                .build();

        byte[] bytes = user.toByteArray();
        System.out.println(bytes.length);

        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
    }
}
