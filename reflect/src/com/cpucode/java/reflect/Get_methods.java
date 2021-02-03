package reflect;

import com.cpucode.java.jdbc.domain.Person;

import java.lang.reflect.Method;

public class Get_methods {

    public static void main(String[] args) throws Exception{
        //0.获取Person的Class对象
        Class personClass = Person.class;
        /*
          3. 获取成员方法们：
             * Method[] getMethods()
             * Method getMethod(String name, 类<?>... parameterTypes)

             * Method[] getDeclaredMethods()
             * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
         */

        //获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法
        eat_method.invoke(p);

        Method eat_method2 = personClass.getMethod("eat", String.class);
        //执行方法
        eat_method2.invoke(p, "饭");

        System.out.println("---------");

        //获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods){
            System.out.println(method);

            String name = method.getName();
            System.out.println(name);

            System.out.println();

            //method.setAccessible(true);
        }

        System.out.println("---------");

        //获取类名
        String className = personClass.getName();
        System.out.println(className);
    }
}

/*

eat...
eat : 饭
---------
public void domain.Person.setAge(int)
setAge

public int domain.Person.getAge()
getAge

public void domain.Person.eat()
eat

public void domain.Person.eat(java.lang.String)
eat

public java.lang.String domain.Person.toString()
toString

public java.lang.String domain.Person.getName()
getName

public void domain.Person.setName(java.lang.String)
setName

public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
wait

public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
wait

public final void java.lang.Object.wait() throws java.lang.InterruptedException
wait

public boolean java.lang.Object.equals(java.lang.Object)
equals

public native int java.lang.Object.hashCode()
hashCode

public final native java.lang.Class java.lang.Object.getClass()
getClass

public final native void java.lang.Object.notify()
notify

public final native void java.lang.Object.notifyAll()
notifyAll

---------
domain.Person

* */