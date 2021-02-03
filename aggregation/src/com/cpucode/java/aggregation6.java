/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 20:59:35
 * @LastEditTime: 2020-09-16 20:59:59
 * @FilePath: \java\aggregation\aggregation6.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.ArrayList;
import java.util.List;

public class aggregation6 {
    public static void main(String[] args) {
        // 创建List集合对象
        List<String> list = new ArrayList<String>();

        // 往 尾部添加 指定元素
        list.add("cpucode");
        list.add("cpu");

        System.out.println(list);

        // add(int index,String s) 往指定位置添加

        list.add(1, "笨");

        System.out.println(list);

        // String remove(int index) 删除指定位置元素 返回被删除元素
        // 删除索引位置为2的元素
        System.out.println("删除第二个");
        System.out.println(list.remove(2));

        System.out.println(list);

        // String set(int index,String s)
        // 在指定位置 进行 元素替代（改）
        // 修改指定位置元素
        list.set(0, "hello");
        System.out.println(list);

        // String get(int index) 获取指定位置元素

        // 跟size() 方法一起用 来 遍历的
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //还可以使用增强for
        for (String string : list){
            System.out.println(string);
        }
    }
}

/*
[cpucode, cpu]
[cpucode, 笨, cpu]
删除第二个
cpu
[cpucode, 笨]
[hello, 笨]
hello
笨
hello
笨
*/