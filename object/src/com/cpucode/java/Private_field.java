package object;

import javax.swing.*;

public class Private_field {
    public static void main(String[] args){
        Person ming = new Person();

        ming.setName(" cpu_code ");
        ming.setAge(22);

        //ming.setName(" ");
        //ming.setAge(200);

        System.out.println("ming.getName = " + ming.getName());
        System.out.println("ming.getAge = " + ming.getAge());
    }

    static class Person{
        // 外部代码不能直接读取private字段，
        // 但可以通过getName()和getAge()间接获取private字段的值
        private String name;
        private int age;


        public String getName(){
            return this.name;
        }

        public void setName(String name){
            // 检查，不允许传入null和空字符串
            if(name == null || name.isEmpty()) {
                throw new IllegalArgumentException("invail name");
            }

        }

        public int getAge(){
            return this.age;
        }

        public void setAge(int age){
            // 年纪限制
            if(age < 0 || age > 150){
                throw new IllegalArgumentException("invalid age value");
            }
            this.age = age;
        }
    }
}

/**
 * ming.getName = cpu_code
 * ming.getAge = 22
 * */


