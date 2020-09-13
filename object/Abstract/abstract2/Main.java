/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 16:47:12
 * @LastEditTime: 2020-09-13 17:37:44
 * @FilePath: \java\object\Abstract\abstract2\Main.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Abstract.abstract2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        // 创建一个群主对象
        QunZhu qz = new QunZhu("群主" , 200);

        // 创建一个键盘录入
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入金额:");
        double money = sc.nextDouble();

        System.out.println("请输入个数:");
        int count = sc.nextInt();

        // 发送红包
        ArrayList<Double> sendList = qz.send(money, count);
        // 判断,如果余额不足
        if(sendList == null){
            System.out.println(" 余额不足...");
            return;
        }

        // 创建三个成员
        Member m = new Member("m", 10.0);
        Member m2 = new Member("m2", 10.0);
        Member m3 = new Member("m3", 10.0);

        // 打开红包
        m.openHongbao(sendList);
        m2.openHongbao(sendList);
        m3.openHongbao(sendList);

        // 展示信息
        qz.show();
        m.show();
        m2.show();
        m3.show();
    }
}
