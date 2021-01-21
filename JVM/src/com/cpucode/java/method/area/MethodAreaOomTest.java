/**
 * User: cpucode
 * Date: 2021/1/7
 * Time: 16:12
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.method.area;


import com.sun.xml.internal.ws.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * jdk6/7中：
 * -XX:PermSize=10m -XX:MaxPermSize=10m
 *
 * jdk8中：
 * -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m
 */

public class MethodAreaOomTest extends ClassLoader{
    public static void main(String[] args) {
        int j = 0;
        int end = 10000;

        try{
            MethodAreaOomTest test = new MethodAreaOomTest();

            for (int i = 0; i < end; i++) {
                //创建ClassWriter对象，用于生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);
                //指明版本号，修饰符，类名，包名，父类，接口
                classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC,
                        "Class" + i, null,
                        "java/lang/Object", null);

                //返回byte[]
                byte[] code = classWriter.toByteArray();
                /**
                 * 类的加载
                 * Class对象
                 * */
                test.defineClass("Class"+ i , code, 0, code.length);

                j++;
            }
        } finally{
            System.out.println(j);
        }


    }
}

/*
3331
Exception in thread "main" java.lang.OutOfMemoryError: Compressed class space

* */