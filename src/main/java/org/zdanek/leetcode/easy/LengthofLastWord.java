package org.zdanek.leetcode.easy;


import java.util.*;

/*
58. Length of Last Word


https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150
*/
public class LengthofLastWord {

    public int lengthOfLastWord(String s) {
        int output = 0;
        /*lista stringów
        długość słowa
        if znak nie jest " " then długość++1
        if znak jest " " przerwij*/
        char ichar;
        for (int i = s.length() - 1; i >= 0; i--) {
            ichar = s.charAt(i);
            //System.out.println("ichar: "+ichar);
            if (ichar != ' ') {
                output++;
            }

            if (ichar == ' ' && output > 0) {
                break;
            }
        }

        return output;
    }

}