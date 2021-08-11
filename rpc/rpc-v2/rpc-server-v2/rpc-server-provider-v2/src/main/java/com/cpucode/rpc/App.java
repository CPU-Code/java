package com.cpucode.rpc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/8/11 15:29
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        ((AnnotationConfigApplicationContext) context).start();
    }
}
