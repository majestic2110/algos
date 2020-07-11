package com.mp.cp;

public class G_Mock_Q004_StudentAttendanceRecord {
    /**
     * You are given a string representing an attendance record for a student. The record only contains the following three characters:
     * 'A' : Absent.
     * 'L' : Late.
     * 'P' : Present.
     * A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
     * <p>
     * You need to return whether the student could be rewarded according to his attendance record.
     * <p>
     * Example 1:
     * Input: "PPALLP"
     * Output: True
     * Example 2:
     * Input: "PPALLL"
     * Output: False
     *
     * @param s
     * @return
     */
    public boolean checkRecord(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        int absentCount = 0;
        char prev = '#';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A') {
                absentCount++;
                if (absentCount > 1) {
                    return false;
                }
            } else if (i > 1 && ch == 'L' && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L') {
                return false;
            }
        }
        return true;
    }
}
