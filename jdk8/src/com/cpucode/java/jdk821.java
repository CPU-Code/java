/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 22:46:56
 * @LastEditTime: 2020-09-22 10:23:42
 * @FilePath: \java\jdk8\jdk821.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package jdk8;

import java.util.ArrayList;
import java.util.List;

public class jdk821 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("cpucode");
        list.add("hello cpu");

        List<String> cpuList = new ArrayList<>();
        for (String name : list) {
            if(name.startsWith("cpu")) {
                cpuList.add(name);
            }
        }

        List<String> shortList = new ArrayList<>();
        for (String name : cpuList) {
            if (name.length() == 7) {
                shortList.add(name);
            }
        }

        for (String name : shortList) {
            System.out.println(name);
        }
    }
}

/*
cpucode
*/