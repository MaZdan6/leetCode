package org.zdanek.leetcode.easy;


/*
14. Longest Common Prefix
https://leetcode.com/problems/longest-common-prefix/
*/
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String output = "";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        String character = "";
        String character2 = "";
        boolean continueCompare = true;
        while (i < 200) {
            if (strs[0].length() < i + 1) {
                break;
            }
            character = strs[0].substring(i, i + 1);
            System.out.println(character);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < i + 1) {
                    continueCompare = false;
                    break;
                }
                character2 = strs[j].substring(i, i + 1);

                System.out.println(String.format("%s, %s", character, character2));
                if (!character.equals(character2)) {
                    continueCompare = false;
                    break;
                }
            }
            if (continueCompare) {
                sb.append(character);
            }else {
                break;
            }

            i++;
        }
        output = sb.toString();
        System.out.println(output);


        return output;
    }

}
