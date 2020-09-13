/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 16:46:55
 * @LastEditTime: 2020-09-13 17:37:52
 * @FilePath: \java\object\Abstract\abstract2\Member.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Abstract.abstract2;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member(){

    }

    public Member(String username, double leftMoney){
        super(username, leftMoney);
    }

    // 打开红包,就是从集合中,随机取出一份,保存到自己的余额中
    public void openHongbao(ArrayList<Double> list){
        // 创建Random对象
        Random r = new Random();
        // 随机生成一个角标
        int index = r.nextInt(list.size());
        // 移除一个金额
        double money = list.remove(index);

        // 直接调用父类方法,设置到余额
        setLeftMoney( money );
    }
}
