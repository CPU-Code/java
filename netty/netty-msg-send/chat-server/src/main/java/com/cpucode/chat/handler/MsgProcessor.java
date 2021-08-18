package com.cpucode.chat.handler;

import com.cpucode.netty.imp.ImMessage;
import com.cpucode.netty.imp.ImP;
import com.cpucode.netty.imp.ImpDecoder;
import com.cpucode.netty.imp.ImpEncoder;
import io.netty.channel.Channel;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONObject;

/**
 * 主要处理用户登陆、退出、上线、下线、发送消息等行为动作的逻辑
 *
 * @author : cpucode
 * @date : 2021/8/17 14:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MsgProcessor {

    /**
     * 记录在线用户数量
     */
    private static ChannelGroup onlineUsers = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    /**
     * 定义一些扩展属性
     */
    private static final AttributeKey<String> NICK_NAME = AttributeKey.valueOf("nickName");
    private static final AttributeKey<String> IP_ADDR = AttributeKey.valueOf("ipAddr");
    private static final AttributeKey<JSONObject> ATTRS = AttributeKey.valueOf("attrs");
    private static final AttributeKey<String> FROM = AttributeKey.valueOf("from");

    /**
     * 解码器
     */
    private ImpDecoder decoder = new ImpDecoder();

    /**
     * 编码器
     */
    private ImpEncoder encoder = new ImpEncoder();

    /**
     * 获取用户的昵称
     *
     * @param client
     * @return
     */
    public String getNickName(Channel client) {
        return client.attr(NICK_NAME).get();
    }

    /**
     * 获取用户远程IP地址
     *
     * @param client
     * @return
     */
    public String getAddress(Channel client) {
        return client.remoteAddress().toString().replace("/", "");
    }

    /**
     * 获取用户的扩展属性
     *
     * @param client
     * @return
     */
    public JSONObject getAttrs(Channel client) {
        return client.attr(ATTRS).get();
    }


    /**
     * 设置用户的扩展属性
     *
     * @param client
     * @param key
     * @param value
     */
    public void setAttrs(Channel client, String key, Object value) {
        JSONObject oldObject = client.attr(ATTRS).get();
        JSONObject newObject = (JSONObject) oldObject.clone();
        newObject.put(key, value);

        //采用CAS方式进行处理
        if (client.attr(ATTRS).compareAndSet(oldObject, newObject)) {
            return;
        } else {
            setAttrs(client, key, value);
        }
    }

    /**
     * 退出操作
     *
     * @param client
     */
    public void logOut(Channel client) {
        //如果昵称为空，表示非法登陆
        if (StringUtils.isBlank(getNickName(client))) {
            return;
        }
        for (Channel channel : onlineUsers) {
            ImMessage request =
                    new ImMessage(ImP.SYSTEM.name(), System.currentTimeMillis(),
                            onlineUsers.size(), String.format("%s离开", getNickName(client)));
            channel.writeAndFlush(new TextWebSocketFrame(encoder.encode(request)));
        }

        onlineUsers.remove(client);
    }


    /**
     * 发送消息
     *
     * @param client
     * @param msg
     */
    public void sendMsg(Channel client, ImMessage msg) {
        sendMsg(client, encoder.encode(msg));
    }

    /**
     * 发送消息
     *
     * @param client
     * @param msg
     */
    public void sendMsg(Channel client, String msg) {
        ImMessage request = decoder.decode(msg);
    }

}
