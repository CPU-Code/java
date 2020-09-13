/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 14:22:56
 * @LastEditTime: 2020-09-13 14:26:48
 * @FilePath: \java\javaAPI\Scanner\anonymous3.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.Scanner;

/*
创建对象的标准格式：
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
new 类名称();

注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象。
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。
 */

public class anonymous3 {
    public static void main(String[] args){

        // 左边的one就是对象的名字
        Person one = new Person();
        one.name = "cpucode";
        one.showName();

        System.out.println("-----------");

        //匿名对象
        new Person().name = "cpu";
        new Person().showName();
    }
}

class Person{
    String name;

    public void showName(){
        System.out.println("我叫 :" + name);
    }
}

/*
我叫 :cpucode
-----------
我叫 :null
*/