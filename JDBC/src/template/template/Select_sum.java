package template.template;

//查询总记录数

import org.springframework.jdbc.core.JdbcTemplate;
import template.utils.JDBCUtils;

public class Select_sum {
    public static void main(String[] args){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql = "select count(id) from student";

        Long total = template.queryForObject(sql, Long.class);

        System.out.println(total);
    }
}

/*
7
* */