package com.mp.cp.mock;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() <= 1) {
            return true;
        }
        boolean isFirstCaps = word.charAt(0) == Character.toUpperCase(word.charAt(0));
        boolean isSecondCaps = word.charAt(1) == Character.toUpperCase(word.charAt(1));
        if (!isFirstCaps && isSecondCaps) {
            return false;
        }
        for (int i = 2; i < word.length(); i++) {
            char ch = word.charAt(i);
            boolean isCaps = word.charAt(i) == Character.toUpperCase(word.charAt(i));
            if (isFirstCaps && isSecondCaps && !isCaps) {
                return false;
            }
            if (!isSecondCaps && isCaps) {
                return false;
            }
        }
        return true;
    }
}
