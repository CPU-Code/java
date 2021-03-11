package com.cpucode.java.gc.log;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * java.lang.OutOfMemoryError: Metaspace异常演示：
 *
 * -Xms60m -Xmx60m -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -XX:+PrintHeapAtGC
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 10:31
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MetaspaceOom extends ClassLoader{
    public static void main(String[] args) {
        int j = 0;
        try {
            MetaspaceOom test = new MetaspaceOom();
            int num = 1000;

            for (int i = 0; i < num; i++) {
                //创建ClassWriter对象，用于生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);

                //指明版本号，修饰符，类名，包名，父类，接口
                classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);

                //返回byte[]
                byte[] code = classWriter.toByteArray();

                //类的加载
                test.defineClass("Class" + i, code, 0, code.length);

                j++;
            }
        }finally {
            System.out.println(j);
        }
    }
}
