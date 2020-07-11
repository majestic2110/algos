package com.mp.cp;

public class G_Mock_Q003_LicenseKeyFormatting {
    /**
     * You are given a license key represented as a string S which consists only alphanumeric character and dashes. The string is separated into N+1 groups by N dashes.
     * <p>
     * Given a number K, we would want to reformat the strings such that each group contains exactly K characters, except for the first group which could be shorter than K, but still must contain at least one character. Furthermore, there must be a dash inserted between two groups and all lowercase letters should be converted to uppercase.
     * <p>
     * Given a non-empty string S and a number K, format the string according to the rules described above.
     * <p>
     * Example 1:
     * Input: S = "5F3Z-2e-9-w", K = 4
     * <p>
     * Output: "5F3Z-2E9W"
     * <p>
     * Explanation: The string S has been split into two parts, each part has 4 characters.
     * Note that the two extra dashes are not needed and can be removed.
     * Example 2:
     * Input: S = "2-5g-3-J", K = 2
     * <p>
     * Output: "2-5G-3J"
     * <p>
     * Explanation: The string S has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.
     * Note:
     * The length of string S will not exceed 12,000, and K is a positive integer.
     * String S consists only of alphanumerical characters (a-z and/or A-Z and/or 0-9) and dashes(-).
     * String S is non-empty.
     *
     * @param S
     * @param K
     * @return
     */
    public String licenseKeyFormatting(String S, int K) {
        if (S == null || S.length() == 0) {
            return "";
        }
        StringBuffer buff = new StringBuffer();
        int ct = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            char ch = S.charAt(i);
            if (ch != '-') {
                if (ct > 0 && ct % K == 0) {
                    buff.append('-');
                }
                buff.append(Character.toUpperCase(ch));
                ct++;
            }
        }
        return buff.reverse().toString();
    }
}
