/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 18:26:46
 * @LastEditTime: 2020-09-16 18:32:31
 * @FilePath: \java\Generic\Generic5.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Generic;

import Abstract.abstract1;

public class Generic5 {
    public static void main(String[] args) {
        MyImp2<String> my = new MyImp2<String>();

        my.add("cpucode");

        System.out.println(my.getE());
    }
}

interface MyGenericInterface<E>{
    public abstract void add(E e);

    public abstract E getE();
}

class MyImp2<E> implements MyGenericInterface<E> {
    E e;
    
    @Override
    public void add(E e){

    }

    @Override
    public E getE() {
        return null;
    }
}

/*
cpucode
*/