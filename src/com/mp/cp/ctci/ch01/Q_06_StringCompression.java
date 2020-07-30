package com.mp.cp.ctci.ch01;

public class Q_06_StringCompression {
    public String compress(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        StringBuffer buff = new StringBuffer();
        char prev = '#';
        int i = 0;
        int len = s.length();
        int count = 0;
        while (i < len) {
            if (s.charAt(i) == prev) {
                count++;
            } else {
                appendCount(buff, count, prev);
                prev = s.charAt(i);
                count = 1;
            }
            i++;
        }
        appendCount(buff, count, s.charAt(len - 1));
        return buff.toString().length() < s.length() ? buff.toString() : s;
    }

    private void appendCount(StringBuffer buff, int count, char ch) {
        if (count > 0) {
            buff.append(ch).append(count);
        }
    }
}
