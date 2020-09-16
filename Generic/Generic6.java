/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 19:28:38
 * @LastEditTime: 2020-09-16 19:30:01
 * @FilePath: \java\Generic\Generic6.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Generic;

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

/*
[]
[]
*/