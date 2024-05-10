package org.zdanek.leetcode.easy;


import java.util.ArrayList;
/*

 * 88. Merge Sorted Array

 * https://leetcode.com/problems/merge-sorted-array/description/

 * */

public class MergeSortedArray {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        int l = 0;
        ArrayList<Integer> nums3 = new ArrayList<>(nums1.length);

        int a;
        int b;
        while (k < m) {
            if (l >= n) {
                nums3.add(nums1[k]);
                k++;
                continue;
            }
            a = nums1[k];
            b = nums2[l];
            if (a < b) {
                nums3.add(a);
                k++;
            } else {
                nums3.add(b);
                l++;
            }
            System.out.println(nums3.toString());
        }
        while (l < n) {
            b = nums2[l];
            nums3.add(b);
            l++;
            System.out.println(nums3.toString());
        }


        for (int i = 0; i < nums3.size(); i++) {
            nums1[i] = nums3.get(i);
        }

    }

}