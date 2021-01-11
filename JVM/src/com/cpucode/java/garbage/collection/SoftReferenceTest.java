/**
 * User: cpucode
 * Date: 2021/1/10
 * Time: 16:29
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.garbage.collection;

import java.lang.ref.SoftReference;

// 软引用的测试：内存不足即回收
// -Xms10m -Xmx10m -XX:+PrintGCDetails

public class SoftReferenceTest {
    public static class User{
        public int id;
        public String name;

        public User(int id, String name){
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString(){
            return "[id = " + id + ", name = " + name + "]";
        }
    }

    public static void main(String[] args) {
        //创建对象，建立软引用
        SoftReference<User> userSoftReference = new SoftReference<User>(new User(1, "cpuCode"));

        //上面的一行代码，等价于如下的三行代码
        User user = new User(2, "cpu");
        SoftReference<User> userSoftRef = new SoftReference<User>(user);
        user = null;    //取消强引用

        //从软引用中重新获得强引用对象
        System.out.println(userSoftReference.get());
        System.out.println(userSoftRef.get());

        System.gc();

        System.out.println("After GC:");

        //垃圾回收之后获得软引用中的对象
        //由于堆空间内存足够，所有不会回收软引用的可达对象
        System.out.println(userSoftReference.get());
        System.out.println(userSoftRef.get());

        try {
            //让系统认为内存资源紧张、不够
            //这是我刻意调出来的值
            byte[] b = new byte[1024 * 7168 - 580 * 1024];

        } catch( Throwable e){
            e.printStackTrace();
        } finally {
            //再次从软引用中获取数据
            //在报OOM之前，垃圾回收器会回收软引用的可达对象
            System.out.println("内存紧张 GC:");
            System.out.println(userSoftReference.get());
            System.out.println(userSoftRef.get());
        }
    }
}
