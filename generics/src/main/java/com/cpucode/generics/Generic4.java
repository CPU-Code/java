/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 18:24:03
 * @LastEditTime: 2020-09-16 18:24:22
 * @FilePath: \java\Generic\Generic4.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.generics;

public class Generic4 {
    public static void main(String[] args) {
        MyGenericMethod mm = new MyGenericMethod();

        mm.show("cpucode");
        mm.show(111);
        System.out.println(mm.show2(32.3));
    }
}

class MyGenericMethod {
    public <MVP> void show(MVP mvp){
        System.out.println(mvp.getClass());
    }

    public <MVP> MVP show2(MVP mvp){
        return mvp;
    }
}
