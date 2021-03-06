package com.cpucode.pattern.create.prototype.simple;

import java.util.List;

/**
 * 创建具体需要克隆的对象
 *
 * @author : cpucode
 * @date : 2021/5/29
 * @time : 12:13
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ConcretePrototypeA implements Prototype {
    private int age;
    private String name;
    private List hobbies;


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }
    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();

        concretePrototypeA.setAge(this.age);
        concretePrototypeA.setName(this.name);
        concretePrototypeA.setHobbies(this.hobbies);

        return concretePrototypeA;
    }
}
