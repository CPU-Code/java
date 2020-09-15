/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 19:48:16
 * @LastEditTime: 2020-09-15 19:52:25
 * @FilePath: \java\Lambda\lambda7.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Lambda;

public class lambda7 {    public static void main(String[] args){

    // 本来年龄乱序的对象数组
    Person[] array = {
            new Person("cpucode", 22),
            new Person("cpu", 21)
    };

    Arrays.sort(array, (Person a, Person b) -> {
        return a.getAge() - b.getAge();
    });

    for (Person person : array) {
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
com.company.Person@4e50df2e
com.company.Person@1d81eb93
*/