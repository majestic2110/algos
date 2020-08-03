package com.mp.cp.mock;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (!isValid(s.charAt(start))) {
                start++;
                continue;
            }
            if (!isValid(s.charAt(end))) {
                end--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private boolean isValid(char ch) {
        return Character.isLetterOrDigit(ch);
    }
}
