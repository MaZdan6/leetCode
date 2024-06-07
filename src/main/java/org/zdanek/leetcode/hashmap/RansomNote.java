package org.zdanek.leetcode.hashmap;


import java.util.HashMap;
import java.util.Map;

/*
383. Ransom Note
https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
*/
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        boolean output = true;

        Map<String, Integer> mMap = new HashMap();
        Map<String, Integer> rMap = new HashMap();
        String letter;
        Integer quantity;
        for (int i = 0; i + 1 <= magazine.length(); i++) {
            letter = magazine.substring(i, i + 1);
            quantity = 1;
            if (mMap.containsKey(letter)) {
                quantity = mMap.get(letter) + 1;

            }
            mMap.put(letter, quantity);
        }

        for (int i = 0; i + 1 <= ransomNote.length(); i++) {
            letter = ransomNote.substring(i, i + 1);
            quantity = 1;
            if (rMap.containsKey(letter)) {
                quantity = rMap.get(letter) + 1;
            }
            rMap.put(letter, quantity);

        }

        for (String letterR : rMap.keySet()) {
            if (!mMap.containsKey(letterR)) {
                output = false;
                break;
            }

            if (rMap.get(letterR) > mMap.get(letterR)) {
                output = false;
                break;
            }
        }

        return output;
    }

}
