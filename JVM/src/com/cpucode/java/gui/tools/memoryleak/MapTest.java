package com.cpucode.java.gui.tools.memoryleak;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/**
 * 演示内存泄漏
 *
 * @author : cpucode
 * @date : 2021/2/12
 * @time : 20:53
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MapTest {
    static Map wMap = new WeakHashMap();
    static Map map = new HashMap();

    public static void main(String[] args) {
        init();
        testWeakHashMap();
        testHashMap();
    }

    public static void init(){
        String ref1 = new String("obejct1");
        String ref2 = new String("obejct2");
        String ref3 = new String("obejct3");
        String ref4 = new String("obejct4");

        wMap.put(ref1, "cacheObject1");
        wMap.put(ref2, "cacheObject2");

        map.put(ref3, "cacheObject3");
        map.put(ref4, "cacheObject4");

        System.out.println("String引用ref1，ref2，ref3，ref4 消失");

        System.out.println();
    }

    public static void testWeakHashMap(){
        System.out.println("WeakHashMap GC之前:");

        for (Object o : wMap.entrySet()){
            System.out.println(o);
        }

        System.out.println();

        try{
            System.gc();

            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("WeakHashMap GC之后");

        for (Object o : wMap.entrySet()){
            System.out.println(o);
        }
        System.out.println();
    }

    public static void testHashMap(){
        System.out.println("HashMap GC之前");

        for (Object o : map.entrySet()){
            System.out.println(o);
        }

        System.out.println();

        try{
            System.gc();

            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("HashMap GC之后");

        for (Object o : map.entrySet()){
            System.out.println(o);
        }

        System.out.println();
    }
}

/**
 * String引用ref1，ref2，ref3，ref4 消失
 *
 * WeakHashMap GC之前:
 * obejct2=cacheObject2
 * obejct1=cacheObject1
 *
 * WeakHashMap GC之后
 *
 * HashMap GC之前
 * obejct4=cacheObject4
 * obejct3=cacheObject3
 *
 * HashMap GC之后
 * obejct4=cacheObject4
 * obejct3=cacheObject3
 * */