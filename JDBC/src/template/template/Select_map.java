package template.template;

import org.springframework.jdbc.core.JdbcTemplate;
import template.utils.JDBCUtils;

import java.util.Map;

//查询id为1001的记录，将其封装为Map集合
//注意：这个方法查询的结果集长度只能是1

public class Select_map {
    public static void main(String[] args){
        //获取JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql = "select * from student where id = ? or id = ?";
        Map<String, Object> map = template.queryForMap(sql,6,null);
        System.out.println(map);
    }

}

/*
{id=6, name=哇哇, age=25}
* */