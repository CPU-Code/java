/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 18:08:09
 * @LastEditTime: 2020-09-14 18:11:18
 * @FilePath: \java\object\Inner_class\Inner_class2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Inner_class;

public class Inner_class2 {
    public static void main(String[] args) {
        /*
        1.等号右边:是匿名内部类，定义并创建该接口的子类对象
        2.等号左边:是多态赋值,接口类型引用指向子类对象
        */
        FlyAble f = new FlyAble() {
            @Override
            public void fly() {
                System.out.println("cpucode");
            }
        };

        //调用 fly方法,执行重写后的方法
        f.fly();
    }
}

//定义接口
abstract class FlyAble{
    public abstract void fly();
}


/*
cpucode
* */