package customize;

// 本质：注解本质上就是一个接口，该接口默认继承Annotation接口
// public interface Customize extends java.lang.annotation.Annotation

public @interface Customize {

    // 基本数据类型
    int value();

    //如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值。
    // String
    String show() default "cpu_code";

    // 枚举
    Person per();

    //注解
    Customize2 customize2();

    //数组
    String[] strs();

    //Worker worker();

}
