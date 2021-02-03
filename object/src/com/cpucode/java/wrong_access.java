/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-11 12:38:34
 * @LastEditTime: 2020-09-11 12:53:33
 * @FilePath: \java\object\wrong_access.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
public class wrong_access {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.name = "Xiao Ming"; // 对字段name赋值
        ming.age = 12; // 对字段age赋值
    }

    static class Person {

        // 拒绝外部访问
        private String name;
        private int age;
    }
}



/*
java: name 在 com.company.Person 中是 private 访问控制
java: age 在 com.company.Person 中是 private 访问控制
*/
