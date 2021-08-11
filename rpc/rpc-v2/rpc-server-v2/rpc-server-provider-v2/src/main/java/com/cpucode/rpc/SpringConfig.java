package com.cpucode.rpc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : cpucode
 * @date : 2021/8/11 15:30
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Configuration
@ComponentScan(basePackages = "com.cpucode.rpc")
public class SpringConfig {
    @Bean(name="cpRpcServer")
    public CpRpcServer cpRpcServer(){
        return new CpRpcServer(8080);
    }
}
