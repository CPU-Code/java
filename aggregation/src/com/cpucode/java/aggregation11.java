/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 09:37:55
 * @LastEditTime: 2020-09-17 09:43:16
 * @FilePath: \java\aggregation\aggregation11.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

public class aggregation11 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        int sum = getSum(arr);

        System.out.println(sum);

        // 求 这几个元素和
        int sum2 = getSum(2, 3, 5, 6);

        System.out.println(sum2);
    }

    /*
    //完成数组 所有元素的求和 原始写法
    public static int getSum(int[] arr){
        int sum = 0;

        for(int a : arr){
            sum += a;
        }

        return sum;
    }
    */

    //可变参数写法
    public static int getSum(int... arr){
        int sum = 0;

        for(int a : arr){
            sum += a;
        }

        return sum;
    }
}

/*
13
16
*/