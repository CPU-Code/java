/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-11 15:06:32
 * @LastEditTime: 2020-09-11 15:06:54
 * @FilePath: \java\object\quote_paramater2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
public class quote_paramater2 {
    public static void main(String[] args) {
        Person p = new Person();
        String bob = "cpucode";

        p.setName(bob); // 传入bob变量
        System.out.println(p.getName()); // "cpucode"

        bob = "cpu"; // bob改名为Alice
        System.out.println(p.getName()); // "cpu"还是"cpucode"?
    }

    static class Person {
        private String name;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}



/*
cpucode
cpucode
*/