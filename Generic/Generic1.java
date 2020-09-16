/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 17:47:09
 * @LastEditTime: 2020-09-16 17:47:36
 * @FilePath: \java\Generic\Generic1.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Generic;

public class Generic1 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();

        coll.add("cpucode");
        coll.add("cpu");
        //由于集合没有做任何限定，任何类型都可以给其中存放
        coll.add(5);

        Iterator it = coll.iterator();

        while (it.hasNext()){
            //需要打印每个字符串的长度,就要把迭代出来的对象转成String类型
            String str = (String) it.next();
            System.out.println(str.length());
        }
    }
}

/*
7
3
Exception in thread "main" java.lang.ClassCastException: c
*/