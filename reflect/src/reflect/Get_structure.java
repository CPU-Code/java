package reflect;

import domain.Person;

import java.lang.reflect.Constructor;

/**
 Class对象功能：
 * 获取功能：
 1. 获取成员变量们
 * Field[] getFields()
 * Field getField(String name)

 * Field[] getDeclaredFields()
 * Field getDeclaredField(String name)
 2. 获取构造方法们
 * Constructor<?>[] getConstructors()
 * Constructor<T> getConstructor(类<?>... parameterTypes)

 * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 * Constructor<?>[] getDeclaredConstructors()
 3. 获取成员方法们：
 * Method[] getMethods()
 * Method getMethod(String name, 类<?>... parameterTypes)

 * Method[] getDeclaredMethods()
 * Method getDeclaredMethod(String name, 类<?>... parameterTypes)

 4. 获取类名
 * String getName()
 */

public class Get_structure {
    public static void main (String[] args) throws Exception{
        //0.获取Person的Class对象
        Class personClass = Person.class;

        /*
        2. 获取构造方法们
             * Constructor<?>[] getConstructors()
             * Constructor<T> getConstructor(类<?>... parameterTypes)

             * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
             * Constructor<?>[] getDeclaredConstructors()
         */

        //Constructor<T> getConstructor(类<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        //创建对象
        Object person = constructor.newInstance("嘿嘿", 22);
        System.out.println(person);

        System.out.println("-------------");

        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);

        Object person1 = constructor1.newInstance();
        System.out.println(person1);

        Object o = personClass.newInstance();
        System.out.println(o);

        //constructor1.setAccessible(true);
    }
}

/*
public domain.Person(java.lang.String,int)
 Person {  name = ' 嘿嘿 '  , age = 22 , a = ' null '  , b = ' null '  , c = ' null '  , d = ' null '  }
-------------
public domain.Person()
 Person {  name = ' null '  , age = 0 , a = ' null '  , b = ' null '  , c = ' null '  , d = ' null '  }
 Person {  name = ' null '  , age = 0 , a = ' null '  , b = ' null '  , c = ' null '  , d = ' null '  }

* */