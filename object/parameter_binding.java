/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-11 14:46:45
 * @LastEditTime: 2020-09-11 14:49:54
 * @FilePath: \java\object\parameter_binding.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
public class parameter_binding {
    public static void main(String[] args) {
        Person p = new Person();

        int n = 15; // n的值为15
        p.setAge(n); // 传入n的值

        System.out.println(p.getAge()); // 15

        // 修改外部的局部变量n，不影响实例p的age字段
        n = 20; // n的值改为20
        
        // 基本类型参数的传递，是调用方值的复制。双方各自的后续修改，互不影响
        System.out.println(p.getAge()); // 15还是20?
    }
}

class Person {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

/*
15
15
*/