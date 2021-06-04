package com.cpucode.dynamic.sell.stocks.time;

/**
 * 一个表示当天持有股票的最大利润，
 * 一个表示当天没持有股票的最大利润
 *
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 20:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SellStocksTest {
    public static void main(String[] args) {
        int[] prices = {1, 4, 2};
        SellStocksTest sellStocksTest = new SellStocksTest();
        int i = sellStocksTest.maxProfit(prices);

        System.out.println(i);
    }

    /**
     * @param prices int整型一维数组
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        int max = 0;
        int hold = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            // 卖最大利润
            max = Math.max(max, hold + prices[i]);

            //买入最低
            hold = Math.max(hold, -prices[i]);
        }

        return max;
    }
}
