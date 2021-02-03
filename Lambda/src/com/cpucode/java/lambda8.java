/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 20:37:47
 * @LastEditTime: 2020-09-15 20:39:33
 * @FilePath: \java\Lambda\lambda8.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Lambda;

public class lambda8 {
    public static void main(String[] args){
        // 使用Lambda【标准格式】调用 invokeCalc 方法来计算 10 + 10 的结果
        invokeCalc(10, 10, (int a, int b) -> {
            return a + b;
        });
    }

    private static void invokeCalc(int a, int b, Calculater calculater){
        int result = calculater.calc(a, b);
        System.out.println("结果 : " + result);
    }
}

interface Calculater{
    // 将两个int数字相加得到和值
    int calc(int a, int b);
}

/*
结果 : 20
*/