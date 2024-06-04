package org.zdanek.leetcode.easy.arraystring;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/*
169. Majority Element

https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
*/
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int output=0;

        TreeMap<Integer,Integer> map=new TreeMap<>();

        Integer amount=0;
        for(int num:nums){
            if(map.keySet().contains(num)){
                amount=map.get(num)+1;
            }else {
                amount=1;
            }
            map.put(num,amount);
        }
        TreeMap<Integer,Integer> valueMap=new TreeMap<>();
        map.forEach((k,v)->valueMap.put(v,k));
        output=valueMap.get(valueMap.lastKey());
        return output;

    }

}