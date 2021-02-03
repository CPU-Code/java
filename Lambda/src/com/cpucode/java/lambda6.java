/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 19:41:33
 * @LastEditTime: 2020-09-15 19:49:38
 * @FilePath: \java\Lambda\lambda6.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class lambda6 {
    public static void main(String[] args){

        // 本来年龄乱序的对象数组
        Person[] array = {
                new Person("cpucode", 22),
                new Person("cpu", 21)
        };

        // 匿名内部类
        Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        // // 第二个参数为排序规则，即Comparator接口实例
        Arrays.sort(array, comp);

        for(Person person: array){
            System.out.println(person);
        }
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

/*
com.company.Person@2f4d3709
com.company.Person@4e50df2e
*/