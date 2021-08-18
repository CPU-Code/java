package com.cpucode.netty.imp;

import lombok.Data;
import org.msgpack.annotation.Message;

/**
 * 用于封装自定义的协议的消息内容
 *
 * @author : cpucode
 * @date : 2021/8/17 11:33
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Message
@Data
public class ImMessage {
    /**
     * IP地址以及端口
     */
    private String addr;

    /**
     * 命令类型[SYSTEM][LOGIN][LOGOUT][CHAT][FLOWER]
     */
    private String cmd;

    /**
     * 命令发送时间
     */
    private long time;

    /**
     * 当前在线人数
     */
    private int online;

    /**
     * 发送人
     */
    private String sender;

    /**
     * 接收人
     */
    private String receiver;
    /**
     * 消息内容
     */
    private String content;

    /**
     * 终端
     */
    private String terminal;

    public ImMessage() {
    }

    public ImMessage(String cmd, String terminal, long time, String sender){
        this.cmd = cmd;
        this.terminal = terminal;
        this.time = time;
        this.sender = sender;
    }

    public ImMessage(String cmd, long time, String sender, String content) {
        this.cmd = cmd;
        this.time = time;
        this.sender = sender;
        this.content = content;
    }

    public ImMessage(String cmd, long time, int online, String content) {
        this.cmd = cmd;
        this.time = time;
        this.online = online;
        this.content = content;
    }

    /**
     * 重写toString方法
     *
     * @return str
     */
    @Override
    public String toString() {
        return "IMMessage{" +
                "addr='" + addr + '\'' +
                ", cmd='" + cmd + '\'' +
                ", time=" + time +
                ", online=" + online +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", content='" + content + '\'' +
                ", terminal='" + terminal + '\'' +
                '}';
    }
}
