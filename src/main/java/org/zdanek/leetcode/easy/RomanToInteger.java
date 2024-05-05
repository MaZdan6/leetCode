package org.zdanek.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RomanToInteger {
    public int romanToInt(String s) {
        // mapa znaków
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //rozbij string na znaki
        //List<String> romans = Arrays.asList(s.split(""));
        char[] romans = s.toCharArray();

        char roman;
        char romanNext;
        Integer arabic = 0;
        for (int i = 0; i < romans.length; i++) {
            roman = romans[i];
            romanNext = ' ';
            if (i + 1 < romans.length) {
                romanNext = romans[i + 1];
            }

            switch (roman) {
                case 'I':
                    if (romanNext == 'V' || romanNext == 'X') {
                        arabic += map.get(romanNext) - map.get('I');
                        i++;
                        continue;
                    }
                case 'X':
                    if (romanNext == 'L' || romanNext == 'C') {
                        arabic += map.get(romanNext) - map.get('X');
                        i++;
                        continue;
                    }
                case 'C':
                    //C jest przed  (D lub M) => (D lub M) - X
                    if (romanNext == 'D' || romanNext == 'M') {
                        arabic += map.get(romanNext) - map.get('C');
                        i++;
                        continue;
                    }
                default:
                    arabic += map.get(roman);
            }
        }

        return arabic;
    }
}
