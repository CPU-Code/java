/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 13:03:34
 * @LastEditTime: 2020-09-14 13:16:55
 * @FilePath: \java\object\polymorphic\polymorphic2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.polymorphic;

public class polymorphic2 {
    public static void main(String[] args){
        // 多态形式，创建对象
        Cat c = new Cat ();
        Dog d = new Dog();

        // 调用showCatEat
        showCatEat(c);
        // 调用showDogEat
        showDogEat(d);
        /*
        以上两个方法, 均可以被showAnimalEat(Animal a)方法所替代
        而执行效果一致
        */
        showAnimalEat(c);
        showAnimalEat(d);
    }

    public static void showCatEat(Cat c){
        c.eat();
    }

    public static void showDogEat(Dog d){
        d.eat();
    }

    public static void showAnimalEat(Animal a){
        a.eat();
    }

    //定义父类
    abstract static class Animal{
        public abstract void eat();
    }

    //定义子类
    static class Cat extends Animal{
        public void eat(){
            System.out.println("吃鱼");
        }
    }

    static class Dog extends Animal{
        public void eat(){
            System.out.println("吃骨头");
        }
    }
}



/*
吃鱼
吃骨头
吃鱼
吃骨头
*/