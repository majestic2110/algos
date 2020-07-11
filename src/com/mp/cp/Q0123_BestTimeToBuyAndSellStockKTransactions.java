package com.mp.cp;

import java.util.Arrays;

public class Q0123_BestTimeToBuyAndSellStockKTransactions {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int k = 2;
        int[] t_ki0 = new int[k + 1];
        int[] t_ki1 = new int[k + 1];
        Arrays.fill(t_ki1, Integer.MIN_VALUE);
        for (int i = 0; i < prices.length; i++) {
            for (int j = k; j > 0; j--) {
                t_ki0[j] = Math.max(t_ki0[j], prices[i] + t_ki1[j]);
                t_ki1[j] = Math.max(t_ki1[j], t_ki0[j - 1] - prices[i]);
            }
        }
        return t_ki0[k];
    }
}
