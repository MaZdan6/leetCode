package org.zdanek.leetcode.easy;

import java.util.ArrayList;

/*
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {


        int num;
        int numNext = 0;

        int numDuplicates = 0;
        ArrayList<Integer> numsK = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            numNext = 0;
            numDuplicates = 0;
            if (i + 1 < nums.length) {
                numNext = nums[i + 1];
            }

            while (num == numNext) {
                numDuplicates++;
                if(i + 1 + numDuplicates<nums.length){
                    numNext = nums[i + 1 + numDuplicates];
                }else {
                    break;
                }
            }
            i = i + numDuplicates;
            numsK.add(num);

        }

        for (int i = 0; i < numsK.size(); i++) {
            nums[i] = numsK.get(i);
        }
/*        System.out.println("size: "+numsK.size());
        System.out.println("k: "+k);*/

        return numsK.size();
    }
}
