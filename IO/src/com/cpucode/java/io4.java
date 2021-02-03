/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-18 10:30:29
 * @LastEditTime: 2020-09-18 10:48:50
 * @FilePath: \java\IO\io4.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.File;
import java.io.IOException;

public class io4 {
    public static void main(String[] args) {
        // 文件的创建
        File f = new File("test.txt");

        System.out.println("是否存在" + f.exists());
        try {
            System.out.println("是否创建 " + f.createNewFile());
        } catch (IOException e){
            System.out.println(e);
        }

        System.out.println("是否存在" + f.exists());

        // 目录的创建
        File f2 = new File("newDir");
        System.out.println("是否存在" + f2.exists());
        System.out.println("是否创建" + f2.mkdir());
        System.out.println("是否存在" + f2.exists());

        // 创建多级目录
        File f3 = new File("newDire\\newDirb");
        System.out.println("mkdir " + f3.mkdir());
        File f4 = new File("newDia\\newDirb");
        System.out.println("mkdirs " + f4.mkdirs());// true

        // 文件的删除
        System.out.println(f.delete());
        // 目录的删除
        System.out.println(f2.delete());
        System.out.println(f4.delete());
    }
}

/*
是否存在false
是否创建 true
是否存在true
是否存在false
是否创建true
是否存在true
mkdir false
mkdirs true
true
true
true
*/