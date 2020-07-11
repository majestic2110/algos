package com.mp.cp;

import java.util.Arrays;

public class Q0188_BestTimeToBuyAndSellStockIV {
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        if (k > prices.length / 2) {
            return maxProfileGreateK(prices);
        } else return maxProfileLessK(k, prices);
    }

    private int maxProfileGreateK(int[] prices) {
        int t_ki0 = 0;
        int t_ki1 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int t_ki0_old = t_ki0;
            t_ki0 = Math.max(t_ki0, prices[i] + t_ki1);
            t_ki1 = Math.max(t_ki1, t_ki0_old - prices[i]);
        }
        return t_ki0;
    }

    private int maxProfileLessK(int k, int[] prices) {
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
