package org.zdanek.leetcode.easy.arraystring;
/*
* 28. Find the Index of the First Occurrence in a String
* https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
* */
public class FindTheIndexOfTheFirstOccurrenceInaString {

    public int strStr(String haystack, String needle) {
        int output =-1;

        int nLength=needle.length();
        int i=-1;
        String hay="";
        while (i+nLength<haystack.length()){
            i++;
            hay=haystack.substring(i,i+nLength);
            if(hay.equals(needle)){
                output=i;
                break;
            }
        }

        return output;
    }
}
