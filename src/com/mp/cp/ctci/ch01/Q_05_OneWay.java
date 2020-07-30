package com.mp.cp.ctci.ch01;

public class Q_05_OneWay {

    public boolean isOneEditAway(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        if (str1.isEmpty()) {
            return str2.length() <= 1;
        }
        if (str2.isEmpty()) {
            return str1.length() <= 1;
        }
        str1 = "#" + str1;
        str2 = "#" + str2;
        int[][] dp = new int[str1.length()][str2.length()];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0 || j == 0) {
                    dp[i][j] = dp[Math.max(i - 1, 0)][Math.max(j - 1, 0)] + 1;
                } else {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1])) + 1;
                    }
                }
            }
        }
        return dp[str1.length() - 1][str2.length() - 1] <= 1;
    }
}
