/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 15:24:53
 * @LastEditTime: 2020-09-13 15:28:26
 * @FilePath: \java\object\Extends\extend3.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Extends;

public class extend3 {
    public static void main(String[] args){
        // 创建子类对象
        Zi z = new Zi();
        // 调用子类中的show方法
        z.show();
    }
}

class Fu{
    // Fu中的成员变量
    int num = 5;
}

class Zi extends Fu {
    // Zi中的成员变量
    int num = 6;

    public void show() {
        //访问父类中的num
        System.out.println("Fu num = " + super.num);

        //访问子类中的num
        System.out.println("Zi num = " + this.num);
    }
}

/*
Fu num = 5
Zi num = 6
*/