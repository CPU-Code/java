package com.cpucode.java.netty.io.bio.tomcat;

import com.cpucode.java.netty.io.bio.tomcat.http.CpRequest;
import com.cpucode.java.netty.io.bio.tomcat.http.CpResponse;
import com.cpucode.java.netty.io.bio.tomcat.http.CpServlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author : cpucode
 * @date : 2021/8/12 11:13
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CpTomcat {
    private int port = 8080;
    private ServerSocket server;

    private Map<String, CpServlet> servletMapping = new HashMap<String, CpServlet>();

    private Properties webxml = new Properties();

    public static void main(String[] args) {
        new CpTomcat().start();
    }

    /**
     * J2EE标准
     *  Servlet   Request   Response
     */

    public void start(){
        //1、加载配置文件，初始化ServeltMapping
        init();

        try {
            server = new ServerSocket(this.port);
            System.out.println("Cp Tomcat 已启动，监听的端口是：" + this.port);

            //2、等待用户请求,用一个死循环来等待用户请求
            while (true){
                Socket client = server.accept();

                //3、HTTP请求，发送的数据就是字符串，有规律的字符串（HTTP协议）
                process(client);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init(){
        //加载web.xml文件,同时初始化 ServletMapping对象
        try{
            String WEB_INF = this.getClass().getResource("/").getPath();
            FileInputStream fis = new FileInputStream(WEB_INF + "web.properties");

            webxml.load(fis);

            for (Object o : webxml.keySet()) {
                String key = o.toString();

                if (key.endsWith(".url")){
                    String url = webxml.getProperty(key);

                    String servletName = key.replaceAll("\\.url$", "");
                    String className = webxml.getProperty(servletName + ".className");

                    //单实例，多线程
                    CpServlet obj = (CpServlet)Class.forName(className).newInstance();
                    servletMapping.put(url, obj);
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void process(Socket client) throws Exception {
        InputStream is = client.getInputStream();
        OutputStream os = client.getOutputStream();

        //Request(InputStrean)/Response(OutputStrean)
        CpRequest request = new CpRequest(is);
        CpResponse response = new CpResponse(os);

        // 从协议内容中拿到URL，把相应的Servlet用反射进行实例化
        String url = request.getUrl();

        if (servletMapping.containsKey(url)){
            servletMapping.get(url).service(request, response);
        }else {
            response.write("404 - Not Found");
        }

        os.flush();

        os.close();
        is.close();
        client.close();
    }


}
