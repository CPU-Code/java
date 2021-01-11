/**
 * User: cpucode
 * Date: 2021/1/10
 * Time: 17:05
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.garbage.collection;

import java.lang.ref.WeakReference;

//弱引用的测试
public class WeakReferenceTest {
    public static class User{
        public int id;
        public String name;

        public User(int id, String name){
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString(){
            return "[ id = " + id + ", name = "+ name + "]";
        }
    }

    public static void main(String[] args){
        //构造了弱引用
        WeakReference<User> userWeakReference = new WeakReference<User>(new User(1, "cpuCode"));

        //从弱引用中重新获取对象
        System.out.println(userWeakReference.get());

        System.gc();

        // 不管当前内存空间足够与否，都会回收它的内存
        System.out.println("After GC:");
        //重新尝试从弱引用中获取对象
        System.out.println(userWeakReference.get());
    }
}

/*
[ id = 1, name = cpuCode]
After GC:
null

* */