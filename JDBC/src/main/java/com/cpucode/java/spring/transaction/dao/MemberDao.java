package com.cpucode.java.spring.transaction.dao;

import com.cpucode.java.spring.transaction.entity.Member;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/8/9
 * @time : 10:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Repository
public class MemberDao {
    private JdbcTemplate template;

    @Resource(name="dataSource")
    protected void setDataSource(DataSource dataSource) {
        template = new JdbcTemplate(dataSource);
    }

    public List<Member> selectAll() throws Exception{
        String sql = "select * from t_member";

        return template.query(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                Member member = new Member();
                member.setName(rs.getString("name"));
                member.setId(rs.getLong("id"));
                member.setAddr(rs.getString("addr"));
                member.setAge(rs.getInt("age"));

                return member;
            }
        });
    }

    public boolean insert(Member m) throws Exception{
        String sql = "insert into t_member(id, name, addr, age) value(?, ?, ?, ?)";
        int count = template.update(sql, m.getId(), m.getName(), m.getAddr(), m.getAge());

        return count > 0;
    }

    public boolean delete(long id) throws Exception{
        return template.update("delete from t_member where id = ?", id) > 0;
    }

    public boolean update(long id,String name) throws Exception{
        return template.update("update t_member set name = ? where id = ?", name, id) > 0;
    }

}
