/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 13:15:39
 * @LastEditTime: 2020-09-16 13:16:04
 * @FilePath: \java\javaAPI\stringBuilder\stringBuilder3.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.stringBuilder;

public class stringBuilder3 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        StringBuilder builder2 = builder.append("cpucode");

        System.out.println("builder :" + builder);
        System.out.println("builder2 :" + builder2);
        System.out.println(builder == builder2);

        builder.append("cpu");
        builder.append("hello");
        builder.append(true);
        builder.append(100);

        builder.append("hello").append("world").append(true).append(100);
        System.out.println("builder:"+builder);
    }
}

/*
builder :cpucode
builder2 :cpucode
true
builder:cpucodecpuhellotrue100helloworldtrue100
*/