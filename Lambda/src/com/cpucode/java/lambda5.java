/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 19:16:23
 * @LastEditTime: 2020-09-15 19:19:57
 * @FilePath: \java\Lambda\lambda5.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Lambda;

public class lambda5 {
    public static void main(String[] args){
        invokeCook(() -> {
            System.out.println("cpucode");
        });
    }

    private static void invokeCook(Cook cook){
        cook.makeFood();
    }
}

interface Cook{
    void makeFood();
}

/*
cpucode
*/