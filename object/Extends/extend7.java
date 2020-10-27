/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 16:08:28
 * @LastEditTime: 2020-09-13 16:11:02
 * @FilePath: \java\object\Extends\extend7.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Extends;

public class extend7 {
    public static void main(String[] args){
        Zi zi = new Zi();
    }

    static class Fu{
        private int n;

        Fu() {
            System.out.println("Fu()");
        }
    }

    static class Zi extends Fu{
        Zi(){
            // super（），调用父类构造方法
            super();

            System.out.println("Zi()");
        }
    }
}



/*
Fu()
Zi()
*/