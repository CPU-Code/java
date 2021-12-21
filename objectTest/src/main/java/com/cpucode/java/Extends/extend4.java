/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 15:34:01
 * @LastEditTime: 2020-09-13 15:36:52
 * @FilePath: \java\object\Extends\extend4.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Extends;

public class extend4 {
    public static void main(String[] args){
        Zi z = new Zi();

        //子类中没有show方法，但是可以找到父类方法去执行
        z.show();
        z.show2();
    }

    static class Fu{
        public void show(){
            System.out.println("Fu类中的show方法执行");
        }
    }

    static class Zi extends Fu{
        public void show2(){
            System.out.println("Zi类 show2方法执行");
        }
    }
}



/*
Fu类中的show方法执行
Zi类 show2方法执行
*/