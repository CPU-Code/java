/**
 * User: cpucode
 * Date: 2021/1/8
 * Time: 16:18
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.Object;

/**
 * 测试对象实例化的过程
 *  ① 加载类元信息       ② 为对象分配内存
 *  ③ 处理并发问题       ④ 属性的默认初始化（零值初始化）
 *  ⑤ 设置对象头的信息   ⑥ 属性的显式初始化、代码块中初始化、构造器中初始化
 *
 *
 *  给对象的属性赋值的操作：
 *  ① 属性的默认初始化 - ② 显式初始化
 *  ③ 代码块中初始化 -   ④ 构造器中初始化
 */

public class Customer {
    int id = 66;

    String name;
    Account acct;

    {
        name = "cpucode";
    }

    public Customer(){
        acct = new Account();
    }
}

class Account{

}

/*

 0 aload_0
 1 invokespecial #1 <java/lang/Object.<init>>
 4 aload_0
 5 bipush 66
 7 putfield #2 <com/cpucode/java/Object/Customer.id>
10 aload_0
11 ldc #3 <cpucode>
13 putfield #4 <com/cpucode/java/Object/Customer.name>
16 aload_0
17 new #5 <com/cpucode/java/Object/Account>
20 dup
21 invokespecial #6 <com/cpucode/java/Object/Account.<init>>
24 putfield #7 <com/cpucode/java/Object/Customer.acct>
27 return

* */