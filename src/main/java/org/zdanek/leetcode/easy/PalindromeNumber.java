package org.zdanek.leetcode.easy;


/*
package org.zdanek.leetcode.easy;
9. Palindrome Number
https://leetcode.com/problems/palindrome-number/description/
*/
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        boolean output = true;
        String xS = String.valueOf(x);
        char[] array = xS.toCharArray();

        int i = 0;
        int j = array.length - 1;

        char l, m;
        while (i < j) {
            l = array[i];
            m = array[j];

            //System.out.println(Character.toString(l) +" , "+ Character.toString(m));
            if (l != m) {
                output = false;
                break;
            }
            i++;
            j = (array.length - 1) - i;
        }
        return output;
    }

}
