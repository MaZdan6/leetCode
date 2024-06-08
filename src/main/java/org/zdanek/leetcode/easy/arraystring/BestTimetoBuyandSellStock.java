package org.zdanek.leetcode.easy.arraystring;


import java.util.TreeMap;

/*
121. Best Time to Buy and Sell Stock

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
*/
public class BestTimetoBuyandSellStock {


    public int maxProfit(int[] prices) {
        int newPrice = 0;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > newPrice) {
                newPrice = prices[i] - min;
            }
        }

        return newPrice;
    }

    //time complexity=o(N)^2
    public int maxProfit2(int[] prices) {
        int output = 0;
        int newPrice = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    continue;
                }
                newPrice = prices[j] - prices[i];
                if (newPrice > output) {
                    output = newPrice;
                }
            }
        }
        return output;
    }

}