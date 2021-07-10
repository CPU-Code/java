package com.cpucode.pattern.structure.decorator.batter.cake.v1;

/**
 * @author : cpucode
 * @date : 2021/7/10
 * @time : 23:30
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BatterCakeTest {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();

        System.out.println(batterCake.getMsg() + ", 总价格：" + batterCake.getPrice());

        BatterCake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getMsg() +
                ", 总价格：" +
                batterCakeWithEgg.getPrice());

        BatterCake battercakeWithEggAndSausage = new BatterCakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg() +
                ", 总价格：" +
                battercakeWithEggAndSausage.getPrice());

    }
}
