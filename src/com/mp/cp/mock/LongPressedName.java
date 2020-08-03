package com.mp.cp.mock;

public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        if (name == null || typed == null) {
            return false;
        }
        char prev = '#';
        int i = 0;
        int j = 0;
        while (i < name.length() && j < typed.length()) {
            char nameChar = name.charAt(i);
            char typedChar = typed.charAt(j);
            if (nameChar == typedChar) {
                prev = nameChar;
                i++;
                j++;
            } else if (prev == typedChar) {
                j++;
            } else {
                return false;
            }
        }
        if (i == name.length()) {
            while (j < typed.length()) {
                if (typed.charAt(j) != prev) {
                    return false;
                }
                j++;
            }
        }
        if (j == typed.length() && i < name.length()) {
            return false;
        }
        return true;
    }
}
