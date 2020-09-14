/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 16:17:26
 * @LastEditTime: 2020-09-14 17:42:43
 * @FilePath: \java\object\Final\Final2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */

package Final;

public class Final2{
    public static void main(String[] args) {
        // 创建 User 对象
        final User u = new User();
        // 创建 另一个 User对象
        //u = new User(); // 报错，指向了新的对象，地址值改变。
        // 调用setName方法
        //u.setName("张三"); // 可以修改

        System.out.println(u.USERNAME);
    }
}

class User {
    final String USERNAME = "cpucode";
    private int age;

    /*
    public void setName(String username){
        this.USERNAME = username;
    }
    */
}

/*
cpucode
*/