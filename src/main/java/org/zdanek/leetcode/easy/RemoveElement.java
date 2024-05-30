package org.zdanek.leetcode.easy;


import java.util.*;

/*
27. Remove Element

https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
*/
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int output=0;
        List<Integer> list= new ArrayList<>();
        for(int num:nums){
            if(num!=val){
                output++;
                list.add(num);
            }
        }

        //list.stream().sorted();
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return  output;
    }

}