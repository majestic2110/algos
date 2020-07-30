package com.mp.cp.ctci.ch01;

public class Q_02_CheckPermutation {
    /**
     * If a string is a permutation os another
     *
     * @param str1
     * @param str2
     * @return
     */
    public boolean isPermutation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        int mask = 0;
        for (int i = 0; i < str1.length(); i++) {
            int shift1 = 1 << (str1.charAt(i) - 'a');
            int shift2 = 1 << (str2.charAt(i) - 'a');
            mask = mask ^ shift1;
            mask = mask ^ shift2;
        }
        return mask == 0;
    }
}
