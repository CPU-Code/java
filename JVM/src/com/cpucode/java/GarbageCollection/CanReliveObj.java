/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 20:59
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.GarbageCollection;

//测试Object类中finalize()方法，即对象的finalization机制。
public class CanReliveObj {
    //类变量，属于 GC Root
    public static CanReliveObj obj;

    //可以把重写注释 或不注释俩种运行结果
    //此方法只能被调用一次
    @Override
    protected void finalize() throws Throwable{
        super.finalize();

        System.out.println("调用当前类重写的finalize()方法");
        //当前待回收的对象在finalize()方法中与引用链上的一个对象obj建立了联系
        obj = this;
    }

    public static void main(String[] args) {
        try{
            obj = new CanReliveObj();

            // 对象第一次成功拯救自己
            obj = null;
            //调用垃圾回收器
            System.gc();
            System.out.println("第1次 gc");

            // 因为Finalizer线程优先级很低，暂停2秒，以等待它
            Thread.sleep(2000);

            if (obj == null){
                System.out.println("obj 挂了");
            } else {
                System.out.println("obj 依然坚强的活着");
            }

            // 下面这段代码与上面的完全相同，但是这次自救却失败了
            obj = null;
            System.gc();

            Thread.sleep(2000);
            if (obj == null){
                System.out.println("obj 挂了");
            } else {
                System.out.println("obj 依然坚强的活着");
            }

        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

/*

重写了finalize

第1次 gc
调用当前类重写的finalize()方法
obj 依然坚强的活着
obj 挂了

没有重写

第1次 gc
obj 挂了
obj 挂了

* */
