package org.zdanek.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {

    public int[] twoSum(int[] nums, int target) {

        //suma dwóch liczb
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] output = new int[2];

        int result;
        for (int i = 0; i < nums.length; i++) {
            output[0] = i;
            result = target - nums[i];

            //jeśli istnieje wartość w mapie to dodaj do wyniku
            //jeśli nie istnieje wartość w mapie to dodaj do mapy
            Integer mapValue=map.get(result);
            if(mapValue!=null){
                output[1]=mapValue;
                break;
            }else {
                map.put(nums[i],i);
            }
        }
        output= Arrays.stream(output).sorted().toArray();
        return output;
    }
}
