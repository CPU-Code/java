/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 21:59:46
 * @LastEditTime: 2020-09-13 22:01:17
 * @FilePath: \java\object\Interface\InterfaceDemo7.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Interface;

public class InterfaceDemo7 {
    public static void main(String[] args){
        C c = new C();

        c.methodA();
    }
}

// 定义接口
interface A {
    public default void methodA() {
        System.out.println("cpucode");
    }
}

//定义父类
class B {
    public void methodA() {
        System.out.println("cpu");
    }
}

class C extends B implements A {
    // 未重写methodA方法
}

/*
cpu
*/