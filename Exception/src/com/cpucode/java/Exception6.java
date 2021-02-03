/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 20:27:55
 * @LastEditTime: 2020-09-14 20:29:13
 * @FilePath: \java\Exception\Exception6.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Exception;

public class Exception6 {
    public static void main(String[] args) {
        String a = "12";
        String b = "x9";

        try {
            int c = stringToInt(a);
            int d = stringToInt(b);

            System.out.println(c * d);
        } catch(NumberFormatException e) {
            System.out.println("Bad input");
        }
    }

    public static int stringToInt(String s){
        return Integer.parseInt(s);
    }
}

/*
Bad input
*/