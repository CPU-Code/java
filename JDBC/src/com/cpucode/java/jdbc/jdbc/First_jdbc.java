package com.cpucode.java.jdbc.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC快速入门
 */
public class First_jdbc {
    public static void main(String[] args) throws Exception{
        //1. 导入驱动jar包
        //2.注册驱动
        //抛出类找不到的异常，注册数据库驱动
        // 加载和注册数据库驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //3.获取数据库连接对象
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cpucode", "root", "12345");
        //Connection conn = DriverManager.getConnection("jdbc:mysql:///cpucode", "root", "12345");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///cpucode?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
                        "root", "12345");

        //4.定义sql语句
        String sql = "update student set age = 30 where id = 1";

        //5.获取执行sql的对象 Statement
        Statement statement = conn.createStatement();

        //6.执行sql
        int count = statement.executeUpdate(sql);
        //7.处理结果

        System.out.println("count = " + count);

        //8.释放资源
        statement.close();
        conn.close();
    }
}

/*
count = 1
* */

/*

CREATE DATABASE cpucode;	 -- 创建数据库

USE cpucode;	 -- 使用数据库

-- 创建表
CREATE TABLE IF NOT EXISTS student(
	id INT PRIMARY KEY AUTO_INCREMENT,	-- 学生id
	NAME VARCHAR(20) NOT NULL,	-- 学生姓名
	age INT NOT NULL 	-- 学生年龄
);


-- 插入数据
INSERT INTO student VALUES(NULL,'CPU',33);
INSERT INTO student VALUES(NULL,'cpucode',12);
INSERT INTO student VALUES(NULL,'哈哈',22);
INSERT INTO student VALUES(NULL,'cpu',44);

* */