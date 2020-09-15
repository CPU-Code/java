/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 22:07:40
 * @LastEditTime: 2020-09-14 22:13:24
 * @FilePath: \java\Exception\Exception11.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Exception;

public class Exception11 {
    public static void main(String[] args){
        //创建一个数组
        int[] arr = {2, 4, 32, 22};

        //根据索引找对应的元素
        int index = 4;
        int element = getElement(arr, index);

        System.out.println(element);
        System.out.println("over");
    }
    
    //根据 索引找到数组中对应的元素
    static int getElement(int[] arr, int index){   
        //判断 索引是否越界 
        if(index < 0 || index > arr.length - 1){
            /*
            判断条件如果满足，当执行完throw抛出异常对象后，方法已经无法继续运算。
            这时就会结束当前方法的执行，并将异常告知给调用者。这时就需要通过异常来解决。
            */
            throw new ArrayIndexOutOfBoundsException("哥们，角标越界了~~~");
        }

        int element = arr[index];

        return element;
    }
}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 哥们，角标越界了~~~
	at com.company.Main.getElement(Main.java:32)
	at com.company.Main.main(Main.java:18)
*/