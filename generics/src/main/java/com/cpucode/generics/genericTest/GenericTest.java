package com.cpucode.generics.genericTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 类型通配符一般是使用 ? 代替具体的类型参数
 *  ？ - 表示不确定的 java 类型
 *
 * @author : cpucode
 * @date : 2021/12/20 15:02
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GenericTest {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("cpuCode");
        age.add(20);
        number.add(360);

        getData(name);
        getData(age);
        getData(number);
    }

    public static void getData(List<?> data) {
        System.out.println("data : " + data.get(0));
    }
}
