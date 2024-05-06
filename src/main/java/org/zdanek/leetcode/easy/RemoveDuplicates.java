package org.zdanek.leetcode.easy;

import java.util.ArrayList;

/*
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        //remove the duplicates in-place such that each unique element appears only once.
        //The relative order of the elements should be kept the same.
        //Then return the number of unique elements in nums.

        int num;
        int numNext = 0;
        int k=0;
        int numDuplicates=0;
        ArrayList<Integer> numsK= new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            numNext = 0;
            numDuplicates=0;
            if (i + 1 < nums.length) {
                numNext = nums[i + 1];
            }

            while (num==numNext) {
                numDuplicates++;
                numNext = nums[i+1+numDuplicates];
            }
            i=i+numDuplicates;
            numsK.add(num);

        }

        numsK.forEach(e->{
            System.out.println(e);
        });
        System.out.println("size: "+numsK.size());
        System.out.println("k: "+k);

        return numsK.size();
    }
}
