/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 16:25:36
 * @LastEditTime: 2020-09-16 16:26:23
 * @FilePath: \java\aggregation\aggregation2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class aggregation2 {
    public static void main(String[] args) {
        // 使用多态方式 创建对象
        Collection<String> coll = new ArrayList<String>();

        // 添加元素到集合
        coll.add("cupcode");
        coll.add("cpu");

        //遍历
        //使用迭代器 遍历   每个集合对象都有自己的迭代器
        Iterator<String> it = coll.iterator();

        //  泛型指的是 迭代出 元素的数据类型
        //判断是否有迭代元素
        while (it.hasNext()){
            String s = it.next();       //获取迭代出的元素
            System.out.println(s);
        }
    }
}

/*
cupcode
cpu
*/