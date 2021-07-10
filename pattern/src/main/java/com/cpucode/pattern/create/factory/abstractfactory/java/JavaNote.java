package com.cpucode.pattern.create.factory.abstractfactory.java;

import com.cpucode.pattern.create.factory.abstractfactory.Note;

/**
 * Java 课堂笔记
 *
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:43
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JavaNote implements Note {
    @Override
    public void edit() {
        System.out.println("编写 Java 笔记");
    }
}
