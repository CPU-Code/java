/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 21:09:54
 * @LastEditTime: 2020-09-14 21:14:33
 * @FilePath: \java\Exception\Exception8.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Exception;

public class Exception8 {
    public static void main(String[] args){
        try{
            process1();
        } catch(Exception e){
            // 捕获 IllegalArgumentException ，我们看看打印的异常栈
            e.printStackTrace();
        }
    }

    static void process1() {
        try{
            process2();
        } catch(NullPointerException e) {
            // 被process1()捕获，然后抛出 IllegalArgumentException()
            throw new IllegalArgumentException();
        }
    }

    static void process2(){
        // 抛出 NullPointerException
        throw new NullPointerException();
    }
}

/*
java.lang.IllegalArgumentException
	at com.company.Main.process1(Main.java:24)
	at com.company.Main.main(Main.java:14)
*/