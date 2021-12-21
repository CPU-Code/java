package com.cpucode.java.Abstract.abstract2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        // 创建一个群主对象
        QunZhu qz = new QunZhu("群主" , 200);

        // 创建一个键盘录入
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入金额:");
        double money = sc.nextDouble();

        System.out.println("请输入个数:");
        int count = sc.nextInt();

        // 发送红包
        ArrayList<Double> sendList = qz.send(money, count);
        // 判断,如果余额不足
        if(sendList == null){
            System.out.println(" 余额不足...");
            return;
        }

        // 创建三个成员
        Member m = new Member("m", 10.0);
        Member m2 = new Member("m2", 10.0);
        Member m3 = new Member("m3", 10.0);

        // 打开红包
        m.openHongbao(sendList);
        m2.openHongbao(sendList);
        m3.openHongbao(sendList);

        // 展示信息
        qz.show();
        m.show();
        m2.show();
        m3.show();
    }
}
