/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 21:26:36
 * @LastEditTime: 2020-09-12 21:43:10
 * @FilePath: \java\javaAPI\String\concat_string.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.String;

public class concat_string {
    public static void main(String[] args){
        //定义一个int类型的数组
        int[] arr = {1, 2, 3};

        //调用方法
        String s = arrayToString(arr);

        //输出结果
        System.out.println("s =" + s);
    }

    // 写方法实现把数组中的元素按照指定的格式拼接成一个字符串
    public static String arrayToString(int[] arr){
        // 创建字符串s
        String s = new String("[");

        // 遍历数组，并拼接字符串
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length -1){
                s = s.concat(arr[i] + "]");
            } else {
                s = s.concat(arr[i] + "#");
            }
        }

        return s;
    }
}

/*
s =[1#2#3]
*/