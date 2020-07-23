package com.mp.cp.ctci.ch01;

public class UniqueString {
    /**
     * If a string has all unique characters.
     * - hash map O(n) with O(n) space
     * - sort array O(n log n)
     * - instead od hashmap use single int O(n) with O(1) space
     *
     * @param str
     * @return
     */
    public boolean isUnique(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }
        int mask = 0;
        for (int i = 0; i < str.length(); i++) {
            int shift = 1 << (str.charAt(i) - 'a');
            if ((mask & shift) == 1) {
                return false;
            }
            mask = mask | shift;
        }
        return true;
    }
}
