/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-11 14:27:11
 * @LastEditTime: 2020-09-11 14:30:32
 * @FilePath: \java\object\call_method.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
public class call_method {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("cpucode"); // 设置name
        ming.setAge(22); // 设置age
        System.out.println(ming.getName() + ", " + ming.getAge());
    }
}

class Person {
    private String name;
    private int age;

    // 方法间接修改private字段
    public String getName() {
        return this.name;
    }

    public void setName(String name) {

        // 不允许传入null和空字符串
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {

        // 参数超出了范围，直接报错
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}

/*
cpucode, 22
*/