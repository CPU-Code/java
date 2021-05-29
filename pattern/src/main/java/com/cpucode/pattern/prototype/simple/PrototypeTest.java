package com.cpucode.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 引用地址是相同的，意味着复制的不是值，而是引用的地址。
 *
 * 修改任意一个对象中的属性值，
 *  concretePrototype 和 concretePrototypeCone 的 hobbies 值都会改变
 *
 *  浅克隆 :
 *      只是完整复制了值类型数据，没有赋值引用对象
 *
 * @author : cpucode
 * @date : 2021/5/29
 * @time : 12:17
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PrototypeTest {
    public static void main(String[] args) {
        // 创建一个具体的需要克隆的对象
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        // 填充属性， 方便测试
        concretePrototype.setAge(18);
        concretePrototype.setName("prototype");

        List hobbies = new ArrayList<String>();
        concretePrototype.setHobbies(hobbies);
        System.out.println(concretePrototype);

        // 创建 Client 对象， 准备开始克隆
        Client client = new Client(concretePrototype);
        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA)
                client.startClone(concretePrototype);

        System.out.println(concretePrototypeClone);

        System.out.println("克隆对象中的引用类型地址值： " + concretePrototypeClone.getHobbies());
        System.out.println("原对象中的引用类型地址值： " + concretePrototype.getHobbies());
        System.out.println("对象地址比较： " +
                (concretePrototypeClone.getHobbies() == concretePrototype.getHobbies()));
    }
}
