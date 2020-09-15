package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception14 {
    
    public static void main(String[] args) throws IOException {
        try{
            // 可能产生异常的代码
            // 当产生异常时，必须有处理方式。要么捕获，要么声明。
            read("b.txt");
        } catch(FileNotFoundException e) {
            // 实现对捕获到的异常进行处理
            //try中抛出的是什么异常，在括号中就定义什么异常类型
            System.out.println(e);
        }

        System.out.println("over");
    }

    // 我们 当前的这个方法中 有异常 有编译期异常
    public static void read(String path) throws FileNotFoundException {
        if(!path.equals("a.txt")) {
            //如果不是 a.txt这个文件
            // 我假设 如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常 throw
            throw new FileNotFoundException("文件不存在");
        }
    }
}

/*
java.io.FileNotFoundException: 文件不存在
over
*/