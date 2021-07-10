package com.cpucode.pattern.structure.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * CGLib 代理的目标对象不需要实现任何接口，它是通过动态继承目标对象实现的动态代理
 *
 * CGLib 和 JDK 动态代理对比
 *  1.JDK 动态代理是实现了被代理对象的接口，CGLib 是继承了被代理对象。
 *  2.JDK 和 CGLib 都是在运行期生成字节码，JDK 是直接写 Class 字节码，
 *   CGLib 使用 ASM框架写 Class 字节码，Cglib 代理实现更复杂，生成代理类比 JDK 效率低。
 *  3.JDK 调用代理方法，是通过反射机制调用，
 *   CGLib 是通过 FastClass 机制直接调用方法，CGLib 执行效率更高
 *
 * JDK是采用读取接口的信息
 *  CGLib覆盖父类方法
 *  目的：都是生成一个新的类，去实现增强代码逻辑的功能
 *
 * JDK Proxy 对于用户而言，必须要有一个接口实现，目标类相对来说复杂
 *  CGLib 可以代理任意一个普通的类，没有任何要求
 *
 *  CGLib 生成代理逻辑更复杂，效率,调用效率更高，生成一个包含了所有的逻辑的FastClass，不再需要反射调用
 *  JDK Proxy生成代理的逻辑简单，执行效率相对要低，每次都要反射动态调用
 *
 *  CGLib 有个坑，CGLib不能代理 final 的方法
 *
 *  CGLib 动态代理执行代理方法效率 :
 *   为代理类和被代理类各生成一个 Class，这个 Class 会为代理类或被代理类的方法分配一个 index(int 类型)。
 *   这个 index 当做一个入参，FastClass就可以直接定位要调用的方法直接进行调用，这样省去了反射调用，
 *   所以调用效率比 JDK 动态代理通过反射调用高
 *
 * @author : cpucode
 * @date : 2021/5/30
 * @time : 16:50
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CglibTest {
    public static void main(String[] args) {

        try {
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                    "D://cglib_proxy_classes");

            Customer obj = (Customer)new CglibMeipo().getInstance(Customer.class);

            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
