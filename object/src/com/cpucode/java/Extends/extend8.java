/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 16:12:57
 * @LastEditTime: 2020-09-13 16:16:05
 * @FilePath: \java\object\Extends\extend8.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Extends;

public class extend8 {
    public static void main(String[] args){
        Animal a = new Animal();

        a.eat();

        Cat c = new Cat();
        c.eatTest();
    }
}

class Animal{
    public void eat(){
        System.out.println("animal : eat");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("cat : eat");
    }

    public void eatTest(){
        // this 调用本类的方法
        this.eat();
         // super 调用父类的方法
        super.eat();
    }
}

/*
animal : eat
cat : eat
animal : eat
*/