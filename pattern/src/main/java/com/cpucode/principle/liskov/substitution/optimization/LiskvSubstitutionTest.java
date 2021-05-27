package com.cpucode.principle.liskov.substitution.optimization;

/**
 * 子类可以扩展父类的功能，但不能改变父类原有的功能
 *
 * 子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法
 * 子类中可以增加自己特有的方法
 * 当子类的方法重载父类的方法时，方法的前置条件（即方法的输入/入参）要比父类方法的输入参数更宽松
 * 当子类的方法实现父类的方法时（重写/重载或实现抽象方法），方法的后置条件（即方法的输出/返回值）要比父类更严格或相等
 *
 * 约束继承泛滥，开闭原则的一种体现
 * 加强程序的健壮性，同时变更时也可以做到非常好的兼容性，提高程序的维护性、扩展性。
 * 降低需求变更时引入的风险
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 20:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LiskvSubstitutionTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setWidth(20);
        rectangle.setHeight(10);
        resize(rectangle);

        Square square = new Square();
        square.setLength(10);
        resize(square);
    }

    public static void resize(Quadrangle quadrangle){
        while (quadrangle.getWidth() > quadrangle.getHeight()){
            quadrangle.setHeight(quadrangle.getHeight() + 1);

            System.out.println("width:" + quadrangle.getWidth() +
                    ",height:" + quadrangle.getHeight());
        }

        System.out.println("resize 方法结束");
        System.out.println("width:" + quadrangle.getWidth() +
                ",height:" + quadrangle.getHeight());
    }
}
