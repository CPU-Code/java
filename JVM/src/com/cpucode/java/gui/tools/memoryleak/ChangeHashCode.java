package com.cpucode.java.gui.tools.memoryleak;

import java.util.HashSet;

/**
 * 演示内存泄漏
 *
 * @author : cpucode
 * @date : 2021/2/14
 * @time : 14:56
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ChangeHashCode {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        Person p1 = new Person(1001, "Cpu");
        Person p2 = new Person(1002, "Code");

        set.add(p1);
        set.add(p2);

        //导致了内存的泄漏
        p1.name = "CCC";

        //删除失败
        set.remove(p1);

        System.out.println(set);

        set.add(new Person(1001, "ppp"));
        System.out.println(set);

        set.add(new Person(1001, "uuu"));
        System.out.println(set);
    }
}

class Person{
    int id;
    String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(!(o instanceof Person)){
            return false;
        }

        Person person = (Person) o;

        if(id != person.id){
            return false;
        }

        return (name != null ? name.equals(person.name) : person.name == null);
    }

    @Override
    public int hashCode(){
        int result = id;

        result = 31 * result + (name != null ? name.hashCode() : 0);

        return result;
    }

    @Override
    public String toString(){
        return "Person{" +
                "id=" + id +
                ", name=" + name + '\'' +
                '}';
    }

}
