/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 22:49:06
 * @LastEditTime: 2020-09-13 22:53:50
 * @FilePath: \java\object\polymorphic\polymorphic1.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package polymorphic;

public class polymorphic1 {
    public static void main(String[] args){
        // 多态形式，创建对象
        Animal a1 = new Cat();

        // 调用的是 Cat 的 eat
        a1.eat();

        // 多态形式，创建对象
        Animal a2 = new Dog();

        // 调用的是 Dog 的 eat
        a2.eat();
    }
}

// 定义父类
abstract class Animal{
    public abstract void eat();
}

// 定义子类
class Cat extends Animal{
    public void eat(){
        System.out.println("吃鱼");
    }
}

class Dog extends Animal{
    public void eat() {
        System.out.println("吃骨头");
    }
}

/*
吃鱼
吃骨头
*/