/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 15:56:57
 * @LastEditTime: 2020-09-13 16:02:13
 * @FilePath: \java\object\Extends\extend6.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Extends;

public class extend6 {
    public static void main(String[] args){
        // 创建子类对象
        NewPhone np = new NewPhone();

        // 调用父类继承而来的方法
        np.call();

        // 调用子类重写的方法
        np.showNum();
    }
}

class Phone{
    public void sendMessage(){
        System.out.println("发短信");
    }

    public void call(){
        System.out.println("打电话");
    }

    public void showNum() {
        System.out.println("来电显示");
    }
}

/**
 * 智能手机类
 */
class NewPhone extends Phone{
    /**
     * 重写父类的来电显示号码功能，并增加自己的显示姓名和图片功能
     */
    public void showNum(){
        //调用父类已经存在的功能使用super
        super.showNum();

        //增加自己特有显示姓名和图片功能
        System.out.println("显示来电姓名");
        System.out.println("显示头像");
    }
}

/*
打电话
来电显示
显示来电姓名
显示头像
*/