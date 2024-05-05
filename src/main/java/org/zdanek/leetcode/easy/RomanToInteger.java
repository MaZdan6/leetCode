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

            switch (roman) {
                case "I":
                    if (romanNext.equals("V") || romanNext.equals("X")) {
                        arabic = map.get(romanNext) - map.get("I");
                        arabics.add(arabic);
                        i++;
                        continue;
                    }
                case "X":
                    if (romanNext.equals("L") || romanNext.equals("C")) {
                        arabic = map.get(romanNext) - map.get("X");
                        arabics.add(arabic);
                        i++;
                        continue;
                    }
                case "C":
                    //C jest przed  (D lub M) => (D lub M) - X
                    if (romanNext.equals("D") || romanNext.equals("M")) {
                        arabic = map.get(romanNext) - map.get("C");
                        arabics.add(arabic);
                        i++;
                        continue;
                    }
                default:
                    arabics.add(map.get(roman));
            }
        }
        //sumuj wszystkie liczby
        int output = arabics.stream()
                .reduce(0, Integer::sum);

        return output;
    }
}
