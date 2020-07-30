package com.mp.cp.ctci.ch01;

public class Q_04_PalindromePermutation {
    public boolean isPalindromePermutation(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        int mask = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                int shift = 1 << (Character.toLowerCase(s.charAt(i)) - 'a');
                mask = mask ^ shift;
            }
        }
        return mask == 0 || (mask & (mask - 1)) == 0;
    }
}
