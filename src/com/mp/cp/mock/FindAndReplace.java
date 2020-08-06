package com.mp.cp.mock;

import java.util.Arrays;

public class FindAndReplace {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        if (S == null || S.length() == 0) {
            return "";
        }
        StringBuffer buff = new StringBuffer();
        int len = S.length();
        int[] match = new int[len];
        Arrays.fill(match, -1);
        for (int i = 0; i < sources.length; i++) {
            if (sources[i].equals(S.substring(indexes[i], indexes[i] + sources[i].length()))) {
                match[indexes[i]] = i;
            }
        }
        int i = 0;
        while (i < S.length()) {
            if (match[i] >= 0) {
                buff.append(targets[match[i]]);
                i += sources[match[i]].length();
            } else {
                buff.append(S.charAt(i));
                i++;
            }
        }
        return buff.toString();
    }
}
