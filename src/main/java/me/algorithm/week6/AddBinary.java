package me.algorithm.week6;

import java.math.BigInteger;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int upper = 0;
        StringBuilder s = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int sum = upper;

            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            s.append(sum % 2);
            upper = sum / 2;
        }

        if (upper != 0) {
            s.append(upper);
        }

        return s.reverse().toString();
    }
}
