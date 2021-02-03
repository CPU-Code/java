/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 11:36:45
 * @LastEditTime: 2020-09-12 12:01:23
 * @FilePath: \java\javaAPI\string_capital.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI;

public class string_capital {
    public static void main(String[] args) {
        String s = "my name is %s , age is %d!";

        //System.out.println(s.formatted("cpu_code", 21));
        System.out.println(String.format("my name is %s , age is %d!","cpu", 22));
    }
}

/*
有几个占位符，后面就传入几个参数。参数类型要和占位符一致。我们经常用这个方法来格式化信息。常用的占位符有：

%s：显示字符串；
%d：显示整数；
%x：显示十六进制整数；
%f：显示浮点数。
*/