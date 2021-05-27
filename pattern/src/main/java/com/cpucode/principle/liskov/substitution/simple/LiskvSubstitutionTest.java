package com.cpucode.principle.liskov.substitution.simple;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 20:35
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LiskvSubstitutionTest {
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() > rectangle.getHeight()){
            rectangle.setHeight(rectangle.getHeight() + 1);

            System.out.println("width:" + rectangle.getWidth() +
                    ",height:" + rectangle.getHeight());
        }

        System.out.println("resize 方法结束");
        System.out.println("width:" + rectangle.getWidth() +
                ",height:" + rectangle.getHeight());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setWidth(20);
        rectangle.setHeight(10);
        resize(rectangle);

        Square square = new Square();
        square.setLength(10);
        resize(square);
    }
}
