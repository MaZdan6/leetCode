package org.zdanek.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LongestCommonPrefixTest {


    @ParameterizedTest
    @MethodSource("testParameters")
    void longestCommonPrefixTest(String[] strs,String expectedValue) {

        System.out.println("    strs: "+ Arrays.toString(strs));
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String output=solution.longestCommonPrefix(strs);


        System.out.println("expected: "+ expectedValue);
        System.out.println("  actual: "+ output);
        assertEquals(expectedValue, output);

    }


    static Stream<Arguments> testParameters() {

        return Stream.of(

                arguments(new String[]{"flower","flow","flight"},"fl"),
                arguments(new String[]{"dog","racecar","car"},"")

        );

    }
    @ParameterizedTest
    @MethodSource("testParametersSpecial")
    void longestCommonPrefixTestSpecial(String[] str,String expectedValue) {
        longestCommonPrefixTest(str,expectedValue);
    }
    static Stream<Arguments> testParametersSpecial() {

        return Stream.of(
                arguments(new String[]{"flower","flow","flight"},"fl")
        );

    }
}