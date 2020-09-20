/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-20 19:14:02
 * @LastEditTime: 2020-09-20 19:16:25
 * @FilePath: \java\IO\io47.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.*;

public class io47 {
    public static void main(String[] args) throws IOException {
        Employee e = null;

        try{
            // 创建反序列化流
            FileInputStream fileIn = new FileInputStream("cpucode_out.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            // 读取一个对象
            e = (Employee) in.readObject();

            // 释放资源
            in.close();
            fileIn.close();
        } catch (IOException i) {
            // 捕获其他异常
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            // 捕获类找不到异常
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        // 无异常,直接打印输出
        System.out.println("Name :" + e.name);
        System.out.println("Addrees :" + e.address);
        System.out.println("age" + e.age);
    }
}

class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public  transient int age;

    public void addressCheck() {
        System.out.println("Address check :" + name + " -- " + address);
    }
}

/*
Name :cpucode
Addrees :changsha
age0
*/