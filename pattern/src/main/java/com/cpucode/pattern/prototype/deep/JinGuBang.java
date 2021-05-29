package com.cpucode.pattern.prototype.deep;

import java.io.Serializable;

/**
 * 创建引用对象金箍棒 JinGuBang 类
 *
 * @author : cpucode
 * @date : 2021/5/29
 * @time : 17:03
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
