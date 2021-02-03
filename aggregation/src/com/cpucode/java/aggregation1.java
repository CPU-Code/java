/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 16:08:20
 * @LastEditTime: 2020-09-16 16:09:29
 * @FilePath: \java\aggregation\aggregation1.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */


package aggregation;

import java.util.ArrayList;
import java.util.Collection;

public class aggregation1    
{
    public static void main(String[] args) {
        // 创建集合对象
        // 使用多态形式
        Collection<String> coll = new ArrayList<String>();

        // 使用方法
        // 添加功能  boolean  add(String s)
        coll.add("cpucode");
        coll.add("cpu");

        System.out.println(coll);

        // boolean contains(E e) 判断o是否在集合中存在
        System.out.println("判断 cpucode 是不是在集合里" + coll.contains("cpucode"));
        System.out.println("判断 cpu 是不是在集合里" + coll.contains("cpu"));

        //boolean remove(E e) 删除在集合中的o元素
        System.out.println("删除cpu: " + coll.remove("cpu"));
        System.out.println("操作后的集合:" + coll);

        // size() 集合中有几个元素
        System.out.println("集合有 " + coll.size() + "个元素");
        // Object[] toArray()转换成一个Object数组
        Object[] objects = coll.toArray();

        // 遍历数组
        for(int i = 0; i < objects.length; i++){
            System.out.println(objects[i]);
        }

        // void  clear() 清空集合
        coll.clear();
        System.out.println("集合内容 :" + coll);
        // boolean  isEmpty()  判断是否为空
        System.out.println(coll.isEmpty());
    }

}

/*
[cpucode, cpu]
判断 cpucode 是不是在集合里true
判断 cpu 是不是在集合里true
删除cpu: true
操作后的集合:[cpucode]
集合有 1个元素
cpucode
集合内容 :[]
true
*/