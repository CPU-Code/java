package template.template;

import template.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class Template_data {
    public static void main(String[] args){
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update student set age = 20 where id = ?";
        int count = template.update(sql,5);

        System.out.println(count);
    }
}
