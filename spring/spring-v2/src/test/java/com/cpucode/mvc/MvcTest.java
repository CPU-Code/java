package com.cpucode.mvc;

import com.cpucode.spring.demo.action.MyAction;
import com.cpucode.spring.demo.action.PageAction;
import com.cpucode.spring.demo.service.IModifyService;
import com.cpucode.spring.formework.context.CPApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/8/6
 * @time : 10:51
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MvcTest {
    public static void main(String[] args) {
        CPApplicationContext applicationContext = new CPApplicationContext("classpath:application.properties");

        Object bean = null;
        try {
            //bean = applicationContext.getBean(MyAction.class);
            bean = applicationContext.getBean(IModifyService.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(bean);
    }
}
