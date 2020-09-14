/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 17:11:09
 * @LastEditTime: 2020-09-14 17:13:17
 * @FilePath: \java\Exception\Exception2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Exception;

public class Exception2 {
    public static void main(String[] args){
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK(String s){
        return s.getBytes("GBK");
    }
}

/*
java: 未报告的异常错误java.io.UnsupportedEncodingException; 必须对其进行捕获或声明以便抛出
*/