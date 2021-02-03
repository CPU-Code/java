/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 18:21:03
 * @LastEditTime: 2020-09-21 18:25:56
 * @FilePath: \java\jdk8\jdk88.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package jdk8;

import java.util.function.Supplier;

public class jdk88 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 5, 10};

        //调用getMax方法,参数传递Lambda
        int maxNum = getMax(() -> {
            //计算数组的最大值
            int max = arr[0];

            for(int i : arr) {
                if(i > max) {
                    max = i;
                }
            }

            return max;
        });

        System.out.println(maxNum);
    }

    //定一个方法,方法的参数传递Supplier,泛型使用Integer
    private static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}

/*
10
*/