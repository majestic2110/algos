package com.mp.cp;

import java.util.Arrays;

public class Q0066_PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[]{};
        }
        int n = digits.length;
        int[] res = new int[n + 1];
        int carry = 1;
        int i = n - 1;
        int index = n;
        while (carry > 0 && i >= 0) {
            int sum = carry + digits[i];
            res[index--] = sum % 10;
            carry = sum / 10;
            i--;
        }
        while (i >= 0) {
            res[index--] = digits[i];
            i--;
        }
        if (carry > 0) {
            res[0] = carry;
        }
        return carry > 0 ? res : Arrays.copyOfRange(res, 1, res.length);
    }

    public int[] plusOneII(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[]{};
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
