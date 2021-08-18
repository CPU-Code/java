package com.cpucode.netty.imp;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.apache.commons.lang3.StringUtils;
import org.msgpack.MessagePack;

import java.util.Objects;

/**
 * 自定义编码器，在发送消息前，对消息内容进行编码处理
 *
 * @author : cpucode
 * @date : 2021/8/17 11:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ImpEncoder extends MessageToByteEncoder<ImMessage> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext,
                          ImMessage imMessage, ByteBuf byteBuf) throws Exception {
        byteBuf.writeBytes(new MessagePack().write(imMessage));
    }

    public String encode(ImMessage msg) {
        if (Objects.isNull(msg)) {
            return "";
        }

        StringBuilder builder = new StringBuilder(String.format("[%s][%s]", msg.getCmd(), msg.getTime()));

        if (ImP.LOGIN.name().equals(msg.getCmd()) || ImP.FLOWER.name().equals(msg.getCmd())) {
            builder.append(String.format("[%s][%s]", msg.getSender(), msg.getTerminal()));
        } else if (ImP.CHAT.name().equals(msg.getCmd())) {
            builder.append(String.format("[%s]", msg.getSender()));
        } else if (ImP.SYSTEM.name().equals(msg.getCmd())) {
            builder.append(String.format("[%s]", msg.getOnline()));
        }

        if (StringUtils.isNotBlank(msg.getContent())) {
            builder.append(String.format(" - %s", msg.getContent()));
        }

        return builder.toString();
    }

}
