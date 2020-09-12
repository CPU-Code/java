/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 18:18:27
 * @LastEditTime: 2020-09-12 18:37:27
 * @FilePath: \java\javaAPI\ArrayList\print_ArrayList.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.ArrayList;

import java.util.ArrayList;

public class print_ArrayList {
    public static void main(String[] args){
        // 创建集合对象
        ArrayList<String>list = new ArrayList<String>();

        // 添加字符串到集合中
        list.add("cpucode");
        list.add("cpu");

        // 调用方法
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String>list){
        // 拼接左括号
        System.out.print("{");

        // 遍历集合
        for(int i = 0; i < list.size(); i++){
            // 获取元素
            String s = list.get(i);

            // 拼接@符号
            if(i != list.size() -1){
                System.out.print(s + "@");
            } else {
                // 拼接右括号
                System.out.print(s + "}");
            }
        }

    }
}

/*
{cpucode@cpu}
*/