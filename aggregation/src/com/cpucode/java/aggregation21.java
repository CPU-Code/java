/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 18:14:33
 * @LastEditTime: 2020-09-17 19:16:23
 * @FilePath: \java\aggregation\aggregation21.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.Scanner;
import java.util.HashMap;

public class aggregation21 {
    public static void main(String[] args) {
        //友情提示
        System.out.println("输入字符串");

        String line = new Scanner(System.in).nextLine();

        // 定义 每个字符出现次数的方法
        findChar(line);
    }

    private static void findChar(String line){
        //1:创建一个集合 存储 字符 以及其出现的次数
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        //2:遍历字符串
        for (int i = 0; i < line.length(); i++){
            char c = line.charAt(i);

            //判断 该字符 是否在键集中
            if(!map.containsKey(c)){
                //说明这个字符没有出现过
                //那就是第一次
                map.put(c, 1);
            } else {
                //先获取之前的次数
                Integer count = map.get(c);

                //再次存入 更新
                map.put(c, ++count);
            }
        }
        System.out.println(map);
    }
}

/*
输入字符串
cpucode
{p=1, c=2, d=1, u=1, e=1, o=1}
*/