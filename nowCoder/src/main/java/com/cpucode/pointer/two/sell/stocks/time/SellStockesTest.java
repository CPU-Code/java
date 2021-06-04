package com.cpucode.pointer.two.sell.stocks.time;

import com.cpucode.dynamic.sell.stocks.time.SellStocksTest;

/**
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 20:32
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SellStockesTest {
    public static void main(String[] args) {
        int[] prices = {1, 4, 2};
        SellStocksTest sellStocksTest = new SellStocksTest();
        int i = sellStocksTest.maxProfit(prices);

        System.out.println(i);
    }

    /**
     *
     * @param prices int整型一维数组
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        int min = prices[0];
        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);

            max = Math.max(max, prices[i] - min);
        }

        return max;
    }

}
