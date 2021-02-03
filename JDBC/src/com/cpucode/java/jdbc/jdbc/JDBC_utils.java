package com.cpucode.java.jdbc.jdbc;

import com.cpucode.java.jdbc.domain.Student;
import com.cpucode.java.jdbc.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//使用JDBC工具类实现查询

public class JDBC_utils {
    public static void main(String[] args){
        List<Student> list = new JDBC_utils().findAll();

        System.out.println(list);
        System.out.println(list.size());
    }

    public List<Student> findAll(){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<Student> list = null;

        try {
            connection = JDBCUtils.getConnection();

            String sql = "select * from student";

            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            //6.遍历结果集，封装对象，装载集合
            Student student1 = null;
            list = new ArrayList<Student>();
            while (resultSet.next()){
                //获取数据
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                // 创建emp对象,并赋值
                student1 = new Student();

                student1.setId(id);
                student1.setName(name);
                student1.setAge(age);

                //装载集合
                list.add(student1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, statement, connection);
        }
        return list;
    }
}

/*
[Emp{ id = 1, name = CPU, age = 30},
Emp{ id = 2, name = cpucode, age = 12},
Emp{ id = 4, name = cpu, age = 44},
Emp{ id = 5, name = 哇哇, age = 25},
Emp{ id = 6, name = 哇哇, age = 25}]
5
* */