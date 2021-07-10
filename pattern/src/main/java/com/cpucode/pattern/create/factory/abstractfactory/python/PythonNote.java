package com.cpucode.pattern.create.factory.abstractfactory.python;

import com.cpucode.pattern.create.factory.abstractfactory.Note;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PythonNote implements Note {
    @Override
    public void edit() {
        System.out.println("编写 Python 笔记");
    }
}
