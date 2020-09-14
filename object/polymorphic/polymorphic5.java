/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 13:35:16
 * @LastEditTime: 2020-09-14 13:37:39
 * @FilePath: \java\object\polymorphic\polymorphic5.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package polymorphic;

public class polymorphic5 {
    public static void main(String[] args){
        // 向上转型
        Animal a = new Cat();
        a.eat();        // 调用的是 Cat 的 eat

        // 转换前，我们最好先做一个判断
        // 向下转型
        if(a instanceof Cat){
            Cat c = (Cat)a;
            c.catchMouse(); // 调用的是 Cat 的 catchMouse
        } else if(a instanceof Dog){
            Dog d = (Dog)a;
            d.watchHouse();     // 调用的是 Dog 的 watchHouse
        }
    }
}

abstract class Animal {
    abstract void eat();
}

class Cat extends Animal{
    public void eat(){
        System.out.println("吃鱼");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("吃骨头");
    }

    public void watchHouse(){
        System.out.println("看家");
    }
}

/*
吃鱼
抓老鼠
*/