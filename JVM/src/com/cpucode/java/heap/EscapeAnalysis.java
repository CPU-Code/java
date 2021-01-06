/**
 * User: cpucode
 * Date: 2021/1/6
 * Time: 15:14
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.heap;

/*
 * 逃逸分析
 *
 *  如何快速的判断是否发生了逃逸分析，就看new的对象实体是否有可能在方法外被调用。
 *  默认开启逃逸分析
 *
 * 早期6版本
 *  -XX:+DoEscapeAnalysis      开启逃逸分析
 *  -XX:+PrintEscapeAnalysis 查看逃逸分析筛选结果
* */
public class EscapeAnalysis {

    //当前的obj引用声明为static的？仍然会发生逃逸
    public EscapeAnalysis obj;

    //方法返回EscapeAnalysis对象，发生逃逸
    public EscapeAnalysis getInstance(){
        return obj == null ? new EscapeAnalysis() : obj;
    }

    //为成员属性赋值，发生逃逸
    public void setObj(){
        this.obj = new EscapeAnalysis();
    }

    //引用成员变量的值，发生逃逸
    public void useEscapeAnalysis1(){
        EscapeAnalysis e = getInstance();

        //getInstance().xxx()同样会发生逃逸
    }

    //对象的作用域仅在当前方法中有效，没有发生逃逸
    public void useEscapeAnalysis(){
        EscapeAnalysis e = new EscapeAnalysis();

    }

    public static void main(String[] args) {
        EscapeAnalysis escapeAnalysis = new EscapeAnalysis();

        escapeAnalysis.getInstance();
        escapeAnalysis.setObj();
        escapeAnalysis.useEscapeAnalysis();
        escapeAnalysis.useEscapeAnalysis1();

        System.out.printf("我是 cpuCode");

    }
}
