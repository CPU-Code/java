package com.cpucode.pattern.delegate.simple;

/**
 * 下达命令
 *
 * @author : cpucode
 * @date : 2021/5/30
 * @time : 21:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Boss {
    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
