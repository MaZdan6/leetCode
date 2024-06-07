package org.zdanek.leetcode.hashmap;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.zdanek.leetcode.easy.RemoveElement;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RansomNoteTest {

    @ParameterizedTest
    @MethodSource("testParameters")
    void genericTest(String ransomNote, String magazine, boolean expectedValue) {

        System.out.println("    ransomNote: "+ ransomNote);
        System.out.println("    magazine: "+ magazine);
        RansomNote solution = new RansomNote();
        boolean output=solution.canConstruct(ransomNote,magazine);


        System.out.println("expected: "+ expectedValue);
        System.out.println("  actual: "+ output);
        assertEquals(expectedValue, output);


    }


    static Stream<Arguments> testParameters() {

        return Stream.of(
                arguments("a","b",false),
                arguments("aa","ab",false),
                arguments("aa","aab",true),
                arguments("abc","ab",false)

        );

    }
    @ParameterizedTest
    @MethodSource("testParametersSpecific")
    void specificTest(String ransomNote, String magazine, boolean expectedValue) {
        genericTest(ransomNote,magazine,expectedValue);
    }
    static Stream<Arguments> testParametersSpecific() {

        return Stream.of(
                arguments("abc","ab",false)
        );

    }

}