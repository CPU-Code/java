/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-20 19:34:59
 * @LastEditTime: 2020-09-20 20:02:00
 * @FilePath: \java\IO\io48.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.*;
import java.util.ArrayList;

public class io48 {
    public static void main(String[] args) throws IOException , ClassNotFoundException{
        //1.定义一个存储Person对象的ArrayList集合
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("cpucode", 22));
        list.add(new Person("cpu", 21));
        list.add(new Person("hello", 23));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cpucode_out.txt"));
        oos.writeObject(list);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cpucode.txt"));
        Object o = ois.readObject();

        ArrayList<Person> list2 = (ArrayList<Person>)o;

        for(Person p : list2) {
            System.out.println(p);
        }

        //9.释放资源
        ois.close();
        oos.close();
    }
}

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;

    public int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name =" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

/*
Person{name =cpucode', age=22}
Person{name =cpu', age=21}
Person{name =hello', age=23}
*/