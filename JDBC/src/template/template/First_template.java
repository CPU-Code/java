package template.template;

//JdbcTemplate入门

import org.springframework.jdbc.core.JdbcTemplate;
import template.utils.JDBCUtils;

public class First_template {
    public static void main(String[] args){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql = "update student set age = 33 where id = 5";

        int count = template.update(sql);

        System.out.println(count);
    }
}
