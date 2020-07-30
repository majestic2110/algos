package com.mp.cp.ctci.ch01;

public class Q_03_URLify {
    public char[] urlify(char[] s, int len) {
        if (s == null || s.length == 0) {
            return s;
        }
        int i = len - 1;
        int k = s.length - 1;
        while (i >= 0) {
            if (s[i] != ' ') {
                s[k--] = s[i--];
            } else {
                s[k--] = '0';
                s[k--] = '2';
                s[k--] = '%';
                i--;
            }
        }
        return s;
    }
}
