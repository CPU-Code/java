/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-18 11:05:46
 * @LastEditTime: 2020-09-18 11:13:21
 * @FilePath: \java\IO\io6.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

public class io6 {
    public static void main(String[] args) {
        //Main();
        //a();
        b(1);
    }

    // 构造方法,禁止递归 , 编译报错:构造方法是创建对象使用的,不能让对象一直创建下去
    public io6(){
    }

    // 在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出。
    // 4993 Exception in thread "main" java.lang.StackOverflowError
    private static void b(int i) {
        System.out.println(i);

        //添加一个递归结束的条件,i==5000的时候结束
        if(i == 5) {
            return; //结束方法
        }

        b(++i);
    }

    // 递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
    // Exception in thread "main" java.lang.StackOverflowError
    private static void a() {
        System.out.println("a 方法");
        a();
    }
}

/*
1
2
3
4
5
*/