package com.cpucode.netty.imp;

/**
 * Instance Messaging Protocol 即时通信协议
 *  枚举类定义消息指令
 *
 * @author : cpucode
 * @date : 2021/8/17 11:36
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public enum ImP {

    SYSTEM,
    LOGIN,
    LOGOUT,
    CHAT,
    FLOWER,
    PING,
    PONG,
    CLOSE;

    public static boolean isImP(String context){
        return context.matches("^\\[(SYSTEM|LOGIN|LOGOUT|CHAT|FLOWER|PING|PONG|CLOSE)\\]");
    }
}
