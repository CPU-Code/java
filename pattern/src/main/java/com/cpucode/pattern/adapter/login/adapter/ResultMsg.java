package com.cpucode.pattern.adapter.login.adapter;

/**
 * 创建统一的返回结果
 *
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 21:07
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ResultMsg {
    private int code;
    private String msg;
    private Object data;

    public ResultMsg() {}

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
