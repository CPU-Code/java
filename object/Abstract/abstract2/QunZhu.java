/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 16:45:53
 * @LastEditTime: 2020-09-13 17:38:09
 * @FilePath: \java\object\Abstract\abstract2\QunZhu.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package object.Abstract.abstract2;

import java.util.ArrayList;

public class QunZhu extends User{

    // 添加构造方法
    public QunZhu(){

    }

    public QunZhu(String username, double leftMoney){
        // 通过super 调用父类构造方法
        super(username, leftMoney);
    }

            /*
            群主发红包，就是把一个整数的金额，分层若干等份。
            1.获取群主余额,是否够发红包.
                不能, 则返回null,并提示.
                能, 则继续.
            2.修改群主余额.
            3.拆分红包.
                3.1.如果能整除，那么就平均分。
                3.2.如果不能整除，那么就把余数分给最后一份。
            */
    public ArrayList<Double> send(double money, int count){
        // 获取群主余额
        double leftMoney = getLeftMoney();

        leftMoney = leftMoney * 100;
        money = money * 100;

        if(money > leftMoney){
            return null;
        }
        // 修改群主余额的
        setLeftMoney(leftMoney / 100.0 - money / 100.0);

        // 创建一个集合,保存等份金额
        ArrayList<Double> list = new ArrayList<>();

        // 扩大100倍,相当于折算成'分'为单位,避免小数运算损失精度的问题


        // 每份的金额
        double m = money / count;

        // 无论是否整除,n‐1份,都是每份的等额金额
        for(int i = 0; i < count - 1; i++){
            // 缩小100倍,折算成 '元'
            list.add(m / 100.0);
        }

        // 不能整除的余数
        double l = money % count;

        // 判断是否整除
        if(l == 0.0) {
            // 能整除, 最后一份金额,与之前每份金额一致
            list.add(m / 100.0);
        } else {
            // 不能整除, 最后一份的金额,是之前每份金额+余数金额
            list.add((m + l) / 100.0);
        }

        // 返回集合
        return list;
    }
}