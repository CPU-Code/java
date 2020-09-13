/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 15:51:46
 * @LastEditTime: 2020-09-13 15:54:09
 * @FilePath: \java\object\Extends\extend5.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Extends;

public class extend5 {
    public static void main(String[] args){
        Zi z = new Zi();
        // 子类中有show方法，只执行重写后的show方法
        z.show();
    }
}

class Fu{
    public void show(){
        System.out.println("Fu show");
    }
}

class Zi extends Fu{

    //子类重写了父类的show方法
    public void show(){
        System.out.println("Zi show");
    }
}

/*
Zi show
*/