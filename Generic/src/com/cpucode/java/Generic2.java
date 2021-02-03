/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 17:51:25
 * @LastEditTime: 2020-09-16 17:51:32
 * @FilePath: \java\Generic\Generic2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Generic;

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
            System.out.println(str.length());
        }
    }
}
