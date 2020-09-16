/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 13:15:39
 * @LastEditTime: 2020-09-16 13:16:55
 * @FilePath: \java\javaAPI\stringBuilder\stringBuilder3.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.stringBuilder;

public class stringBuilder3 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder builder = new StringBuilder();

        //public StringBuilder append(任意类型)
        StringBuilder builder2 = builder.append("cpucode");

        //对比一下
        System.out.println("builder :" + builder);
        System.out.println("builder2 :" + builder2);
        System.out.println(builder == builder2);

        // 可以添加 任何类型
        builder.append("cpu");
        builder.append("hello");
        builder.append(true);
        builder.append(100);

        // 在我们开发中，会遇到调用一个方法后，返回一个对象的情况。然后使用返回的对象继续调用方法。
        // 这种时候，我们就可以把代码现在一起，如append方法一样，代码如下
		//链式编程
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