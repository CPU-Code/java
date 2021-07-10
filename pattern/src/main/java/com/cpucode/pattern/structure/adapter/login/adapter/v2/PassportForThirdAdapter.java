package com.cpucode.pattern.structure.adapter.login.adapter.v2;

import com.cpucode.pattern.structure.adapter.login.adapter.ResultMsg;
import com.cpucode.pattern.structure.adapter.login.adapter.v1.service.SiginService;
import com.cpucode.pattern.structure.adapter.login.adapter.v2.adapters.*;

/**
 * 第三方登录自由适配
 *
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 21:59
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return processLogin(id, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone, LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username,null);
        return super.login(username,null);
    }

    // 用到了简单工厂模式及 策略模式
    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz){
        try{
            //适配器不一定要实现接口
            LoginAdapter adapter = clazz.newInstance();

            //判断传过来的适配器是否能处理指定的逻辑
            if(adapter.support(adapter)){
                return adapter.login(key, adapter);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
