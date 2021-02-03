/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-16 19:43:48
 * @LastEditTime: 2020-09-16 20:00:41
 * @FilePath: \java\aggregation\aggregation5.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

import java.util.ArrayList;
import java.util.Collections;

public class aggregation5 {
    public static void main(String[] args) {
        /*
         * 1: 准备牌操作
         */
        //1.1 创建牌盒 将来存储牌面的
        ArrayList<String> pokerBox = new ArrayList<String>();

        //1.2 创建花色集合
        ArrayList<String> colors = new ArrayList<String>();

        //1.3 创建数字集合
        ArrayList<String> numbers = new ArrayList<String>();

        //1.4 分别给花色 以及 数字集合添加元素
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");

        for(int i = 2; i <= 10; i++){
            numbers.add(i + "");
        }

        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        //1.5 创造牌  拼接牌操作
        // 拿出每一个花色  然后跟每一个数字 进行结合  存储到牌盒中
        for(String color: colors){
            //color每一个花色
            //遍历数字集合
            for(String number : numbers){
                //结合
                String card = color + number;
                //存储到牌盒中
                pokerBox.add(card);
            }
        }

        //1.6大王小王
        pokerBox.add("小王☺");
        pokerBox.add("大王☠");

        // System.out.println(pokerBox);
        //洗牌 是不是就是将  牌盒中 牌的索引打乱
        // Collections类  工具类  都是 静态方法
        // shuffer方法
        /*
         * static void shuffle(List<?> list)
         *     使用默认随机源对指定列表进行置换。
         */
        //2:洗牌
        Collections.shuffle(pokerBox);

        //3 发牌
        //3.1 创建 三个 玩家集合  创建一个底牌集合
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        //遍历 牌盒  必须知道索引
        for(int i = 0; i < pokerBox.size(); i++){
            //获取 牌面
            String card = pokerBox.get(i);

            //留出三张底牌 存到 底牌集合中
            if(i >= 51){
                //存到底牌集合中
                dipai.add(card);
            } else {

                if(i % 3 == 0){
                    //玩家1   %3  ==0
                    player1.add(card);
                } else if(i % 3 == 1){
                    //玩家2
                    player2.add(card);
                } else {
                    //玩家3
                    player3.add(card);
                }
            }

        }

        //看看
        System.out.println("cpucode：" + player1);
        System.out.println("cpu：" + player2);
        System.out.println("hello：" + player3);
        System.out.println("底牌：" + dipai);

    }
}

/*
cpucode：[♥10, ♣4, ♣8, ♣6, ♥6, ♠10, ♦7, ♦6, 大王☠, ♠5, ♥J, ♣2, ♠8, ♥K, ♠9, ♦3, ♠7]
cpu：[♣K, ♣A, ♠Q, ♣7, ♦K, ♠6, ♣5, ♥5, ♣3, ♥3, ♦A, ♥4, ♥8, ♣9, ♥A, ♥9, ♠J]
hello：[♣Q, ♦5, ♦4, ♦Q, ♠A, ♥7, ♦10, ♣J, ♦J, ♥Q, ♠2, ♦2, ♠K, ♠3, ♥2, ♣10, ♦9]
底牌：[♦8, 小王☺, ♠4]
*/