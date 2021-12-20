package com.cpucode.generics.genericUper;

import java.util.ArrayList;
import java.util.List;

/**
 * 类型通配符上限
 *
 * @author : cpucode
 * @date : 2021/12/20 15:06
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GenericUperTest {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("cpuCode");
        age.add(20);
        number.add(222);

        //getUperNumber(name);

        getUperNumber(age);
        getUperNumber(number);
    }

    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }
}
