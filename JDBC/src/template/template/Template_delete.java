package template.template;

//删除记录

import org.springframework.jdbc.core.JdbcTemplate;
import template.utils.JDBCUtils;

public class Template_delete {
    public static void main(String[] args){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql = "delete from student where id = ?";
        int count = jdbcTemplate.update(sql, 4);

        System.out.println(count);
    }
}
