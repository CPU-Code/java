/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-12 17:03:14
 * @LastEditTime: 2020-09-12 17:04:08
 * @FilePath: \java\javaAPI\ArrayList\ArrayListMethod.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package javaAPI.ArrayList;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {

        //创建集合对象
        ArrayList<String> list = new ArrayList<String>();

        //添加元素
        list.add("cpu");
        list.add("code");
        list.add("java");

        //public E get(int index):返回指定索引处的元素
        System.out.println("get :" + list.get(0));
        System.out.println("get :" + list.get(1));
        System.out.println("get :" + list.get(2));

        //public int size():返回集合中的元素的个数
        System.out.println("size :" + list.size());

        //public E remove(int index):删除指定索引处的元素，返回被删除的元素
        System.out.println("remove:"+ list.remove(0));

        //遍历输出
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

/*
get :cpu
get :code
get :java
size :3
remove:cpu
code
java
*/