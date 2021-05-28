package com.cpucode.pattern.singleton.register.en.um;

import com.cpucode.pattern.singleton.register.en.um.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 注册式单例又称为登记式单例，就是将每一个实例都登记到某一个地方，使用唯一的标识获取实例
 *
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 13:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class EnumSingletonTest {
    public static void main(String[] args) {

        try{
            EnumSingleton instance1 = null;

            EnumSingleton instance2 = EnumSingleton.getInstance();

            instance2.setData(new Object());

            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(instance2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);

            instance1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(instance1.getData());
            System.out.println(instance2.getData());
            System.out.println(instance1.getData() == instance2.getData());

            Class clazz = EnumSingleton.class;
            Constructor c  = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);

            // 不能用反射来创建枚举类型
            EnumSingleton enumSingleton = (EnumSingleton)c.newInstance("cpuCode", 666);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
