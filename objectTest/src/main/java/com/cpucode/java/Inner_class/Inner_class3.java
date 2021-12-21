/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 19:06:56
 * @LastEditTime: 2020-09-14 19:30:34
 * @FilePath: \java\object\Inner_class\Inner_class3.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Inner_class;

public class Inner_class3 {
    public static void main(String[] args) {
        /*
        1.等号右边:定义并创建该接口的子类对象
        2.等号左边:是多态,接口类型引用指向子类对象
        */
        FlyAble f = new FlyAble() {

            public void fly() {
                System.out.println("cpucode");
            }
        };

        // 将f传递给showFly方法中
        showFly(f);

    }

    public static void showFly(FlyAble f) {
        f.fly();
    }

    abstract static class FlyAble{
        public abstract void fly();
    }
}



/*
cpucode
* */