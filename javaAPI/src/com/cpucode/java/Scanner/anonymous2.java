package javaAPI;

import java.util.Scanner;

public class anonymous2 {
    public static void main(String[] args) {
        // 普通方式
        Scanner sc = getScanner();
    }

    public static Scanner getScanner(){
        //普通方式
        //Scanner sc = new Scanner(System.in);
        //return sc;

        //匿名对象作为方法返回值
        return new Scanner(System.in);
    }
}
