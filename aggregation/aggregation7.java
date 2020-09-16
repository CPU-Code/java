/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 21:02:07
 * @LastEditTime: 2020-09-16 21:06:59
 * @FilePath: \java\aggregation\aggregation7.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.LinkedList;

public class aggregation7 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();

        //添加元素
        link.addFirst("cpucode");
        link.addFirst("cpu");
        link.addFirst("hello");

        System.out.println(link);

        // 获取元素
        System.out.println("getFirst :" + link.getFirst());
        System.out.println("getFirst :" + link.getFirst());

        // 删除元素
        System.out.println("removeFirst : " + link.removeFirst());
        System.out.println("removeLast : " + link.removeLast());

        while (!link.isEmpty()){
            //判断集合是否为空
            //弹出集合中的栈顶元素
            System.out.println("pop : " + link.pop());
        }

        System.out.println(link);
    }
}

/*
[hello, cpu, cpucode]
getFirst :hello
getFirst :hello
removeFirst : hello
removeLast : cpucode
pop : cpu
[]
*/