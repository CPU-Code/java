/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-11 14:54:45
 * @LastEditTime: 2020-09-11 14:57:57
 * @FilePath: \java\object\quote_paramater.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
public class quote_paramater {
    public static void main(String[] args) {
        Person p = new Person();
        String[] fullname = new String[] { "cpucode", "NB" };

        p.setName(fullname); // 传入fullname数组
        System.out.println(p.getName()); // "Homer Simpson"

        fullname[0] = "cpu"; // fullname数组的第一个元素修改为"cpu"

        // 实例p的字段p.name被修改了
        System.out.println(p.getName()); // "cpucode NB"还是"cpu NB"?

        // 引用类型参数的传递，调用方的变量，和接收方的参数变量，指向的是同一个对象。
        // 双方任意一方对这个对象的修改，都会影响对方（因为指向同一个对象嘛）
    }

    static class Person {
        private String[] name;

        public String getName() {
            return this.name[0] + " " + this.name[1];
        }

        public void setName(String[] name) {
            this.name = name;
        }
    }
}



/*
cpucode NB
cpu NB
*/
