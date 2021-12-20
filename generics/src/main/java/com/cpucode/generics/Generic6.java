package com.cpucode.generics;

import java.util.ArrayList;
import java.util.Collection;

public class Generic6 {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        getElement(list1);

        Collection<String> list2 = new ArrayList<String>();
        getElement(list2);
    }

    public static void getElement(Collection<?> coll){
        System.out.println(coll);
    }
}
