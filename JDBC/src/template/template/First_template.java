package template.template;

//JdbcTemplate入门

import template.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class First_template {
    public static void main(String[] args){
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update student set age = 20 where id = ?";
        int count = jdbcTemplate.update(sql, 3);

        System.out.println(count);
    }
}
