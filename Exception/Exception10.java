/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 21:38:55
 * @LastEditTime: 2020-09-14 22:05:22
 * @FilePath: \java\Exception\Exception10.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Exception;

public class Exception10 {
    public static void main(String[] args){
        int[] arr = {32, 11, 14};

        int num = ArrayTools.getElenment(arr, 4);
        System.out.println("num =" + num);
        System.out.println("over");
    }

    static class ArrayTools {
        // 对给定的数组通过给定的角标获取元素
        public static int getElenment(int[] arr, int index){
            // 产生一个数组索引越界异常 ArrayIndexOfBoundsException
            int element = arr[index];

            return element;
        }
    }
}



/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
	at com.company.ArrayTools.getElenment(Main.java:25)
	at com.company.Main.main(Main.java:15)
*/