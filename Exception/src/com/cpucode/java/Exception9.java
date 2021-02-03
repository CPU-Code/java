/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 21:17:01
 * @LastEditTime: 2020-09-14 21:18:24
 * @FilePath: \java\Exception\Exception9.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Exception;

public class Exception9 {
    
    public static void main(String[] args){
        try{
            process1();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    static void process1() {
        try{
            process2();
        } catch(NullPointerException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void process2(){
        throw new NullPointerException();
    }
}

/*
java.lang.IllegalArgumentException: java.lang.NullPointerException
	at com.company.Main.process1(Main.java:24)
	at com.company.Main.main(Main.java:14)
Caused by: java.lang.NullPointerException
	at com.company.Main.process2(Main.java:29)
	at com.company.Main.process1(Main.java:22)
	... 1 more
*/