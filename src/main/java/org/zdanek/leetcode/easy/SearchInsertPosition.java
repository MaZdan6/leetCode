package org.zdanek.leetcode.easy;

import java.util.LinkedList;


/*
35. Search Insert Position
https://leetcode.com/problems/search-insert-position/
*/
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int a = 0;
        int aPrev = 0;
        int b = nums.length - 1;
        int bPrev = nums.length - 1;
        int c;
        int d;
        int output = 0;

        while (a <= b) {
            System.out.println(String.format("a=%s ,b=%s",a,b));
            c = nums[a];
            d = nums[b];
            if (target == c) {
                output = a;
                break;
            }else if (target < c) {
                if(a-1>0){
                    if(nums[a-1]<target){
                        output=a;
                    }else {
                        output=a-1;
                    }
                }
                break;
            }else if(target>c)  {
                output=a;
            }else  {
                a++;
            }
            if (target == d) {
                output=b;
                break;
            }else if (target > d) {
                output=b+1;
                break;
            }else {
                b--;
            }

            System.out.println("output: " + output);
        }

        return output;
    }

}
