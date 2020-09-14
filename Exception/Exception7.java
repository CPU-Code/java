/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 20:32:11
 * @LastEditTime: 2020-09-14 20:34:50
 * @FilePath: \java\Exception\Exception7.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Exception;

public class Exception7 {
    public static void main(String[] args){
        try{
            process1();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    static void process1(){
        process2();
    }

    static void process2(){
        Integer.parseInt(null);     // 会抛出NumberFormatException
    }
}

/*
java.lang.NumberFormatException: null
	at java.base/java.lang.Integer.parseInt(Integer.java:614)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at com.company.Main.process2(Main.java:25)
	at com.company.Main.process1(Main.java:21)
	at com.company.Main.main(Main.java:14)

Process finished with exit code 0

*/