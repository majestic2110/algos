package com.mp.cp;

public class G_Mock_Q001_RemoveOutermostParentheses {

    public String removeOuterParentheses(String S) {
        if (S == null || S.length() == 0) {
            return S;
        }
        StringBuffer buff = new StringBuffer();
        int start = 0;
        int open = 0;
        int close = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            switch (ch) {
                case '(':
                    open++;
                    break;
                case ')':
                    close++;
                    break;
                default:
                    break;
            }
            if (open == close && open > 0) {
                buff.append(S.substring(start + 1, i));
                start = i + 1;
                open = 0;
                close = 0;
            }
        }
        return buff.toString();
    }
}
