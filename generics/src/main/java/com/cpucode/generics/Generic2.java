
package com.cpucode.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Generic2 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();

        coll.add("cpucode");
        coll.add("cpu");
        //由于集合没有做任何限定，任何类型都可以给其中存放
        //coll.add(5);
        // 集合已经明确具体存放的元素类型，那么在使用迭代器的时候，迭代器也同样会知道具体遍历元素类型
        Iterator<String> it = coll.iterator();

        while (it.hasNext()){
            String str = it.next();

            //当使用Iterator<String>控制元素类型后，就不需要强转了。获取到的元素直接就是String类型
            System.out.println(str + " : " + str.length());
        }
    }
}
