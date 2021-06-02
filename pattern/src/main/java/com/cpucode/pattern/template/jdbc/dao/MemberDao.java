package com.cpucode.pattern.template.jdbc.dao;

import com.cpucode.pattern.template.jdbc.JdbcTemplate;
import com.cpucode.pattern.template.jdbc.Member;
import com.cpucode.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * 数据库操作类
 *
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 15:02
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql = "select * from t_member";

        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();

                //字段过多， 原型模式
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));

                return member;
            }
        } , null);
    }
}
