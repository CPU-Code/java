/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 18:14:33
 * @LastEditTime: 2020-09-17 18:19:46
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
        System.out.println("输入字符串");

        String line = new Scanner(System.in).nextLine();

        findChar(line);
    }

    private static void findChar(String line){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < line.length(); i++){
            char c = line.charAt(i);

            if(!map.containsKey(c)){
                map.put(c, 1);
            } else {
                Integer count = map.get(c);

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