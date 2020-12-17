package template.template;

import org.springframework.jdbc.core.JdbcTemplate;
import template.utils.JDBCUtils;

public class Template_insert {
    public static void main(String[] args){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql = "insert into student(id, name, age) values(?,?,?)";

        int count = template.update(sql, null, "杰克马", 25);

        System.out.println(count);
    }

}
