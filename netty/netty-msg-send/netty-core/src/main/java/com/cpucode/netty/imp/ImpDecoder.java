package com.cpucode.netty.imp;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import org.apache.commons.lang3.StringUtils;
import org.msgpack.MessagePack;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 自定义解码器
 * 主要功能是接收消息后对自定义协议内容进行解码处理
 *
 * @author : cpucode
 * @date : 2021/8/17 11:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ImpDecoder extends ByteToMessageDecoder {
    /**
     * 解析IMP 写一下请求内容的正则
     */
    private Pattern pattern;

    {
        pattern = Pattern.compile("^\\[(.*)\\](\\s\\-\\s(.*))?");
    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext,
                          ByteBuf byteBuf, List<Object> list) throws Exception {
        try{
            //获取可读字节数
            final int length = byteBuf.readableBytes();
            //创建字节数组
            final byte[] bytes = new byte[length];
            byteBuf.getBytes(byteBuf.readerIndex(), bytes, 0, length);
            list.add(new MessagePack().read(bytes, ImMessage.class));
            byteBuf.clear();
        }catch (Exception e){
            e.printStackTrace();
            channelHandlerContext.channel().writeAndFlush(new ImMessage(ImP.CLOSE.name(), System.currentTimeMillis(), ImP.SYSTEM.name(), "you are out!"));
            channelHandlerContext.channel().close();
        }
    }

    /**
     * 字符串解析成自定义即时通信协议
     *
     * @param msg
     * @return
     */
    public ImMessage decode(String msg) {
        if (StringUtils.isBlank(msg)){
            return null;
        }

        Matcher matcher = pattern.matcher(msg);
        String heard = "";
        String content = "";

        if (matcher.matches()){
            heard = matcher.group(1);
            content = matcher.group(3);
        }

        String[] heards = heard.split("\\]\\]");
        long time = Long.parseLong(heards[1]);
        String nickName = heards[2];
        nickName = nickName.length() < 10 ? nickName : nickName.substring(0, 9);

        if (msg.startsWith(String.format("[%s]", ImP.LOGIN.name()))){
            return new ImMessage(heards[0], heards[3], time, nickName);
        }else if (msg.startsWith(String.format("[%s]", ImP.CHAT.name()))){
            return new ImMessage(heards[0], time, nickName, content);
        }else if (msg.startsWith(String.format("[%s]", ImP.FLOWER.name()))) {
            return new ImMessage(heards[0], heards[3], time, nickName);
        } else {
            return null;
        }

    }


}
