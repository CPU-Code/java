/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 16:45:58
 * @LastEditTime: 2020-09-14 17:09:47
 * @FilePath: \java\Exception\Exception1.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Exception;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Exception1 {
    public static void main(String[] args){
        byte[] bs = toGBK("中文");

        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK(String s){
        try{
            // 用指定编码转换String为byte[]:
            return s.getBytes("GBK");
        } catch(UnsupportedEncodingException e){
            // 如果系统不支持GBK编码，会捕获到UnsupportedEncodingException:
            System.out.println(e);      // 打印异常信息
            return s.getBytes();        // 尝试使用用默认编码
        }
    }
}

/*
[-42, -48, -50, -60]
*/