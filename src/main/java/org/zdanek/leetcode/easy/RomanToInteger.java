package org.zdanek.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RomanToInteger {
    public int romanToInt(String s) {
        // mapa znaków
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        //rozbij string na znaki
        List<String> romans = Arrays.asList(s.split(""));
        List<Integer> arabics = new ArrayList<>();

        String roman;
        String romanNext;
        Integer arabic;
        for (int i = 0; i < romans.size(); i++) {
            roman = romans.get(i);
            romanNext = "";
            if (i + 1 < romans.size()) {
                romanNext = romans.get(i + 1);
            }

            //I jest przed  (V lub X) => (V lub X) - I
            if (roman.equals("I")) {
                if (romanNext.equals("V") || romanNext.equals("X")) {
                    arabic = map.get(romanNext) - map.get("I");
                    arabics.add(arabic);
                    i++;
                    continue;
                }
            }
            if (roman.equals("I")) {
                if (romanNext.equals("V") || romanNext.equals("X")) {
                    arabic = map.get(romanNext) - map.get("I");
                    arabics.add(arabic);
                    i++;
                    continue;
                }
            }
            //X jest przed  (L lub C) => (L lub C) - X
            if (roman.equals("X")) {
                if (romanNext.equals("L") || romanNext.equals("C")) {
                    arabic = map.get(romanNext) - map.get("X");
                    arabics.add(arabic);
                    i++;
                    continue;
                }
            }
            //C jest przed  (D lub M) => (D lub M) - X
            if (roman.equals("C")) {
                if (romanNext.equals("D") || romanNext.equals("M")) {
                    arabic = map.get(romanNext) - map.get("C");
                    arabics.add(arabic);
                    i++;
                    continue;
                }
            }
            arabics.add(map.get(roman));
        }

        //sumuj wszystkie liczby
        int output=arabics.stream()
                .reduce(0, Integer::sum);

        return output;
    }
}
