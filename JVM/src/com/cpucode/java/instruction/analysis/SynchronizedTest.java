package com.cpucode.java.instruction.analysis;

/**
 * 指令9：同步控制指令
 * @author : cpucode
 * @Date : 2021/2/1
 * @Time : 17:41
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class SynchronizedTest {
    private int i = 0;

    public void add(){
        i++;

        /**
         *  0 aload_0
         *  1 dup
         *  2 getfield #2 <com/cpucode/java/instruction/analysis/SynchronizedTest.i>
         *  5 iconst_1
         *  6 iadd
         *  7 putfield #2 <com/cpucode/java/instruction/analysis/SynchronizedTest.i>
         * 10 return
         * */
    }

    private Object obj = new Object();

    public void subtract(){
        synchronized(obj){
            i--;
        }

        /**
         *  0 aload_0
         *  1 getfield #4 <com/cpucode/java/instruction/analysis/SynchronizedTest.obj>
         *  4 dup
         *  5 astore_1
         *  6 monitorenter      判断 此对象是否锁标识是否为0, 或者是否是本线程持有
         *  7 aload_0
         *  8 dup
         *  9 getfield #2 <com/cpucode/java/instruction/analysis/SynchronizedTest.i>
         * 12 iconst_1      压栈 1
         * 13 isub          减法
         * 14 putfield #2 <com/cpucode/java/instruction/analysis/SynchronizedTest.i>
         * 17 aload_1
         * 18 monitorexit       释放锁
         * 19 goto 27 (+8)
         * 22 astore_2      异常开始
         * 23 aload_1
         * 24 monitorexit       释放锁
         * 25 aload_2
         * 26 athrow
         * 27 return
         *
         * 异常表:
         * 0	7	19	22	cp_info #0
         * 1	22	25	22	cp_info #0
         * */
    }
}
