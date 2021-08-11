package com.cpucode.rpc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : cpucode
 * @date : 2021/8/11 15:29
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Component
public class CpRpcServer implements ApplicationContextAware, InitializingBean {
    ExecutorService executorService = Executors.newCachedThreadPool();

    private Map<String, Object> handlerMap = new HashMap<>();

    private int port;

    public CpRpcServer(int port){
        this.port = port;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(port);

            while (true){
                //不断接受请求 BIO
                Socket socket = serverSocket.accept();

                //每一个socket 交给一个 processorHandler 来处理
                executorService.execute(new ProcessorHandler(socket, handlerMap));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        Map<String, Object> serviceBeanMap =
                applicationContext.getBeansWithAnnotation(RpcService.class);

        if (!serviceBeanMap.isEmpty()){
            for (Object servieBean : serviceBeanMap.values()) {
                //拿到注解
                RpcService rpcService = servieBean.getClass().getAnnotation((RpcService.class));
                //拿到接口类定义
                String serviceName = rpcService.value().getName();
                //拿到版本号
                String version = rpcService.version();

                if(!StringUtils.isEmpty(version)){
                    serviceName += "-" + version;
                }
                handlerMap.put(serviceName, servieBean);
            }
        }
    }
}
