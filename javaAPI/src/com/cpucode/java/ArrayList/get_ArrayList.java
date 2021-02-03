/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 18:39:13
 * @LastEditTime: 2020-09-12 18:50:39
 * @FilePath: \java\javaAPI\ArrayList\get_ArrayList.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.ArrayList;

import java.util.Random;
import java.util.ArrayList;

public class get_ArrayList {
    public static void main(String[] args){
        // 创建Random 对象
        Random random = new Random();

        // 创建ArrayList 对象
        ArrayList<Integer> list = new ArrayList<>();

        // 添加随机数到集合
        for(int i = 0; i < 20; i++){
            int r = random.nextInt(1000) + 1;
            list.add(r);
        }

        // 调用偶数集合的方法
        ArrayList<Integer> arrayList = getArrayList(list);

        System.out.println(arrayList);
    }

    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list){
        // 创建小集合,来保存偶数
        ArrayList<Integer> smallList = new ArrayList<>();

        // 遍历list
        for(int i =0; i < list.size(); i++){
            // 获取元素
            Integer num = list.get(i);

            // 判断为偶数,添加到小集合中
            if(num % 2 == 0){
                smallList.add(num);
            }
        }

        // 返回小集合
        return smallList;
    }
}

/*
[882, 304, 214, 548, 764, 670, 144, 640, 562]
*/