package com.cpucode.java.spring.orm.javax.core.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : cpucode
 * @date : 2021/8/9
 * @time : 14:39
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Data
public class ResultMsg<T> implements Serializable {
    private static final long serialVersionUID = 2635002588308355785L;

    /**
     * 状态码， 系统的返回码
     */
    private int status;

    /**
     * 状态码的解释
     */
    private String msg;

    /**
     * 放任意结果
     */
    private T data;

    public ResultMsg() {}

    public ResultMsg(int status) {
        this.status = status;
    }

    public ResultMsg(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
    public ResultMsg(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public ResultMsg(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
}
