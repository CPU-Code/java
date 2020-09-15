/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 20:40:44
 * @LastEditTime: 2020-09-15 20:44:59
 * @FilePath: \java\Lambda\lambda9.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Lambda;

public class lambda9 {
    public static void main(String[] args){
        invokeCalc(() -> System.out.println("吃饭"));
    }

    private static void invokeCalc(Cook cook){
        cook.makeFood();
    }
}

/* 使用Lambda必须具有接口，且要求接口中有且仅有一个抽象方法 */

interface Cook{
    void makeFood();
}

/*
吃饭
*/