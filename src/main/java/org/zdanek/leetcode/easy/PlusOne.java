package org.zdanek.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/*
66. Plus One
https://leetcode.com/problems/plus-one/description/?source=submission-noac
*/
public class PlusOne {
    public int[] plusOne(int[] digits) {
        LinkedList<Integer> digitsL = new LinkedList<>();

        int a;
        int b;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                a = digits[i] + 1;
            } else {
                a = digits[i];
            }

            if (a == 10) {
                digitsL.addFirst(0);
                if (i - 1 >= 0) {
                    digits[i - 1] = digits[i - 1] + 1;
                } else {
                    digitsL.addFirst(+1);
                }
            } else {
                digitsL.addFirst(a);

            }
            System.out.println(digitsL);
        }
        int[] output = new int[digitsL.size()];
        for (int i = 0; i < digitsL.size(); i++) {
            output[i] = digitsL.get(i);
        }
        return output;
    }
}
