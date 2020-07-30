package com.mp.cp.ctci.ch01;

public class Q_09_StringRotation {
    interface ISubstring {
        public boolean isSubstring(String s1, String s2);
    }


    class Solution implements ISubstring {
        public boolean isRotation(String s1, String s2) {
            return isSubstring(s1 + s1, s2);
        }

        @Override
        public boolean isSubstring(String s1, String s2) {
            return false;
        }
    }


}
