/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 17:12:02
 * @LastEditTime: 2020-09-12 17:18:22
 * @FilePath: \java\javaAPI\ArrayList\ArrayList_number.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.ArrayList;

import java.util.Random;
import java.util.ArrayList;

public class ArrayList_number {
    public static void main(String[] args){
        // 创建Random 对象
        Random random = new Random();

        // 创建ArrayList 对象
        ArrayList<Integer> list = new ArrayList<>();

        // 添加随机数到集合
        for(int i = 0; i < 6; i++){
            int r = random.nextInt(33) + 1;
            list.add(r);
        }

        // 遍历集合输出
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

/*
16
31
23
23
5
1
*/