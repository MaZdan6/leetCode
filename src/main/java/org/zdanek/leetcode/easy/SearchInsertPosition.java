package org.zdanek.leetcode.easy;

import java.util.LinkedList;


/*
35. Search Insert Position
https://leetcode.com/problems/search-insert-position/
*/
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int a = 0;
        int b = nums.length - 1;
        int d;
        int output = 0;

        while (a <= b) {
            //System.out.println(String.format("a=%s ,b=%s", a, b));
            d = nums[b];
            if (target == d) {
                output = b;
                break;
            } else if (target > d) {
                output = b + 1;
                break;
            } else {
                b--;
            }

            //System.out.println("output: " + output);
        }

        return output;
    }

}
