package com.mp.cp;

public class Q0121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int t_ki0 = 0;
        int t_ki1 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            t_ki0 = Math.max(t_ki0, prices[i] + t_ki1);
            t_ki1 = Math.max(t_ki1, 0 - prices[i]);
        }
        return t_ki0;
    }
}
