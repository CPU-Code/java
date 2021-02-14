package com.cpucode.java.gui.tools.memoryleak;

import java.util.HashSet;

/**
 * 演示内存泄漏
 *
 * @author : cpucode
 * @date : 2021/2/14
 * @time : 15:14
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ChangeHashCode2 {
    public static void main(String[] args) {
        HashSet<Point> hs = new HashSet<Point>();

        Point cc = new Point();
        cc.setX(10);

        hs.add(cc);
        cc.setX(20);
        System.out.println("hs.remove = " + hs.remove(cc));

        hs.add(cc);
        System.out.println("hs.size = " + hs.size());

        System.out.println(hs);
    }
}

/**
 * hs.remove = false
 * hs.size = 2
 * [Point{x=20}, Point{x=20}]
 * */

class Point{
    int x;

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;

        result = prime * result + x;

        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj == null){
            return false;
        }

        if (getClass() != obj.getClass()){
            return false;
        }

        Point other = (Point) obj;

        if (x != other.x){
            return false;
        }

        return true;
    }

    @Override
    public String toString(){
        return "Point{" +
                "x=" + x +
                '}';
    }
}