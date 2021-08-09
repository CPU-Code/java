package com.cpucode.spring.orm.test;

import com.cpucode.java.spring.orm.demo.dao.MemberDao;
import com.cpucode.java.spring.orm.demo.dao.OrderDao;
import com.cpucode.java.spring.orm.demo.entiry.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/8/9
 * @time : 15:05
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@ContextConfiguration(locations = {"classpath:application-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class OrmTest {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmdd");
    @Autowired
    private MemberDao memberDao;

    @Autowired
    private OrderDao orderDao;


    @Test
    public void testSelectAllForMember(){
        try {
            List<Member> result = memberDao.selectAll();
            System.out.println(Arrays.toString(result.toArray()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
