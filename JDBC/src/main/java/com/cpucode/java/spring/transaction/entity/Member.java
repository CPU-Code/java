package com.cpucode.java.spring.transaction.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : cpucode
 * @date : 2021/8/9
 * @time : 10:43
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Entity
@Table(name="t_member")
@Data
public class Member {
    @Id
    private Long id;

    private String name;
    private String addr;
    private Integer age;

    public Member() {
    }

    public Member(String name, String addr, Integer age) {
        this.name = name;
        this.addr = addr;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", age=" + age +
                '}';
    }
}
