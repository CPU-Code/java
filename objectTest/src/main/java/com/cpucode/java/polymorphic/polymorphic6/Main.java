/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 13:59:58
 * @LastEditTime: 2020-09-14 14:01:42
 * @FilePath: \java\object\polymorphic\polymorphic6\Main.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.polymorphic.polymorphic6;

public class Main {
    public static void main(String[] args){
        // 创建笔记本实体对象
        Laptop lt = new Laptop();

        // 笔记本开启
        lt.run();

        // 创建鼠标实体对象
        Use u = new Mouse();

        // 笔记本使用鼠标
        lt.useUse(u);

        // 创建键盘实体对象
        KeyBoard kb = new KeyBoard();

        // 笔记本使用键盘
        lt.useUse(kb);

        // 笔记本关闭
        lt.shoutDown();
    }
}

/*
笔记本运行
鼠标开启, 红灯闪
鼠标单击
鼠标关闭, 红灯灭
键盘开, 绿灯亮
键盘打字
键盘关闭, 绿灯灭
笔记本关闭

*/