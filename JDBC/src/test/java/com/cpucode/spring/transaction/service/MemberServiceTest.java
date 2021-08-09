package com.cpucode.spring.transaction.service;

import com.alibaba.fastjson.JSON;
import com.cpucode.java.spring.transaction.entity.Member;
import com.cpucode.java.spring.transaction.service.MemberService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.util.Arrays;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/8/9
 * @time : 13:26
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@ContextConfiguration(locations = {"classpath*:application-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    @Ignore
    public void queryAll(){
        try{
            List<Member> list = memberService.queryAll();
            System.out.println(JSON.toJSONString(list,true));
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    @Test
    @Ignore
    public void testRemove(){
        try{
            boolean r = memberService.remove(1L);
            System.out.println(r);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    @Ignore
    public void testLogin(){
        try{
            memberService.login(15L, "tom");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testAdd(){
        try{

            Connection con = null;
            //是否要自动提交，默认就是自动提交，没有后悔的机会
            //通过TransactionManager获得后悔的机会
            //事务如何才能做到让我们有后悔的机会呢？

            con.createStatement().execute("");
            //提交流程就由自己控制了
//            con.getTransactionIsolation();
//            con.createStatement().getR
            con.commit();

            con.rollback();


            Member member = new Member("cpucode","Hunan Changsha",18);
            memberService.add(member);
        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
