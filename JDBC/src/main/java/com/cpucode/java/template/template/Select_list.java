package com.cpucode.java.template.template;

//查询所有记录，将其封装为List

import org.springframework.jdbc.core.JdbcTemplate;
import com.cpucode.java.template.utils.JDBCUtils;

import java.util.List;
import java.util.Map;

public class Select_list {
    public static void main(String[] args){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql = "select * from student";

        List<Map<String, Object>> list = template.queryForList(sql);

        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }
}

/*

{id=1, name=CPU, age=30}
{id=2, name=cpucode, age=12}
{id=5, name=哇哇, age=20}
{id=6, name=哇哇, age=25}
{id=7, name=哈哈, age=29}
{id=8, name=哈哈, age=29}
{id=9, name=杰克马, age=25}

* */
