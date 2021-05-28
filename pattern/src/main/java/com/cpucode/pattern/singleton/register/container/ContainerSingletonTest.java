package com.cpucode.pattern.singleton.register.container;

/**
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 22:48
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    Object obj = ContainerSingleton.getInstance("com.cpucode.pattern.singleton.register.container.Pojo");;

                    System.out.println(System.currentTimeMillis() + ": " + obj);
                }
            }, 10,6);
        } catch (Exception e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start) + " ms.");
    }
}
