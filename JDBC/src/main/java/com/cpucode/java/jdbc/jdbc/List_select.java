package com.cpucode.java.jdbc.jdbc;

import com.cpucode.java.jdbc.domain.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// 定义一个方法，查询 表的数据将其封装为对象，然后装载集合，返回

public class List_select {
    public static void main(String[] args){
        List<Student> list = new List_select().findAll();

        System.out.println(list);
        System.out.println(list.size());
    }

    // 查询所有Student对象
    public List<Student> findAll(){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<Student> list = null;

/*        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        try {
            //2.获取连接
            connection = DriverManager.getConnection("jdbc:mysql:///cpucode?serverTimezone=UTC",
                    "root","12345");

            //3.定义sql
            String sql = "select * from student";

            //4.获取执行sql的对象
            statement = connection.createStatement();
            //5.执行sql
            resultSet = statement.executeQuery(sql);

            //6.遍历结果集，封装对象，装载集合
            Student student = null;
            list = new ArrayList<Student>();

            while (resultSet.next()){
                //获取数据
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                // 创建emp对象,并赋值
                student = new Student();
                student.setId(id);
                student.setName(name);
                student.setAge(age);

                //装载集合
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            return list;
        }
    }
}

/*
[Emp{ id = 1, name = CPU, age = 30},    \
Emp{ id = 2, name = cpucode, age = 12},     \
Emp{ id = 4, name = cpu, age = 44},     \
Emp{ id = 5, name = 哇哇, age = 25},  \
Emp{ id = 6, name = 哇哇, age = 25}]
5
* */