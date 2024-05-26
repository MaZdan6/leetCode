package org.zdanek.leetcode.easy;


import java.util.*;

/*
20. Valid Parentheses

https://leetcode.com/problems/valid-parentheses/description/
*/
public class ValidParentheses {

    public boolean isValid(String s) {

        boolean output = false;

        Map<String, String> map = new HashMap<>();
        map.put("{", "}");
        map.put("(", ")");
        map.put("[", "]");

        String iChar;
        String iCharNext;
        String[] charArray = s.split("");
        List<String> charList =new ArrayList<String>(Arrays.asList(charArray)) ;
        //porównaj następujące elementy
        //if nawias then usuń  z listy
        //zacznij od nowa
        for (int i = 0; i < charList.size(); i++) {
            iChar = charList.get(i);
            if(i+1<charList.size()){
                iCharNext = charList.get(i + 1);
            }else {
                break;
            }
            /*System.out.println(charList);
            System.out.println(iChar + " " + iCharNext);*/
            if (map.containsKey(iChar)) {
                if (iCharNext.equals(map.get(iChar))) {
                    charList.remove(i);
                    charList.remove(i);
                    i = -1;
                    continue;
                }

            }

        }
        /*System.out.println(charList);
        System.out.println(charList.size());*/

        if (charList.size() == 0) {
            output = true;
        }

        return output;
    }

}