package template.template;

//查询所有记录，将其封装为stu对象的List集合

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import template.domain.Stu;
import template.utils.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Stu_list {
    public static void main(String[] args){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql = "select * from student";

        List<Stu> list  = template.query(sql, new RowMapper<Stu>() {
            @Override
            public Stu mapRow(ResultSet resultSet, int i) throws SQLException {
                Stu stu = new Stu();

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                stu.setId(id);
                stu.setName(name);
                stu.setAge(age);

                return stu;
            }
        });

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