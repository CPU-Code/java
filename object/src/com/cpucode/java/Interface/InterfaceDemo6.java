/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 21:44:09
 * @LastEditTime: 2020-09-13 21:48:39
 * @FilePath: \java\object\Interface\InterfaceDemo6.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package object.Interface;

public class InterfaceDemo6 {
    public static void main(String[] args){
        C c = new C();

        c.method();
    }

    interface A {
        public default void methodA(){

        }
        public default void method(){

        }
    }

    interface B {
        public default void methodB(){

        }
        public default void method(){

        }
    }

    static class C implements A, B{
        @Override
        public void method(){
            System.out.println("method");
        }

    }
}



/*
method
*/