/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 15:20:31
 * @LastEditTime: 2020-09-13 15:23:48
 * @FilePath: \java\object\Extends\extend2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Extends;

public class extend2 {
    public static void main(String[] args){
        Zi z = new Zi();

        z.show();
    }

    static class Fu{
        // Fu中的成员变量
        int num = 5;
    }

    static class Zi extends Fu{
        // Zi中的成员变量
        int num = 6;

        public void show() {

            // 访问父类中的num
            System.out.println("Fu num =" + num);
            // 访问子类中的num
            System.out.println("ZI num = " + num);
        }
    }
}





/*
Fu num =6
ZI num = 6
*/