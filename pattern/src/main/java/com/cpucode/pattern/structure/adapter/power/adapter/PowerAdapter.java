package com.cpucode.pattern.structure.adapter.power.adapter;

/**
 * 电源适配器
 *
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 21:02
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PowerAdapter implements Dc5 {
    private Ac220 ac220;

    PowerAdapter(){}

    PowerAdapter(Ac220 ac220){
        this.ac220 = ac220;
    }


    @Override
    public int outPutDc5V() {
        int adapterInput = ac220.outputAC220V();

        //变压器...
        int adapterOutput = adapterInput / 44;

        System.out.println("使用 PowerAdapter 输入 AC:" + adapterInput + "V" +
                "输出 DC:" + adapterOutput + "V");

        return adapterOutput;
    }
}
