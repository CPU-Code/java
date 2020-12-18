package template.template;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import template.domain.Stu;
import template.utils.JDBCUtils;

import java.util.List;

public class Stu_simplify {
    public static void main(String[] args){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql = "select * from student";

        List<Stu> list = template.query(sql, new BeanPropertyRowMapper<Stu>(Stu.class));

        for (Stu stu : list){
            System.out.println(stu);
        }
    }
}


/*

Stu{id = 1, name = CPU, age = 30}
Stu{id = 2, name = cpucode, age = 12}
Stu{id = 5, name = 哇哇, age = 20}
Stu{id = 6, name = 哇哇, age = 25}
Stu{id = 7, name = 哈哈, age = 29}
Stu{id = 8, name = 哈哈, age = 29}
Stu{id = 9, name = 杰克马, age = 25}

* */