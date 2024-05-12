package org.zdanek.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PlusOneTest {

    @ParameterizedTest
    @MethodSource("testParameters")
    void plusOneTest(int[] digits,int[] expectedValue) {

        PlusOne solution = new PlusOne();
        int[] output=solution.plusOne(digits);
        System.out.println("expected:"+Arrays.toString(expectedValue));
        System.out.println("  actual:"+ Arrays.toString(digits));
        assertArrayEquals(expectedValue, output);

    }


    static Stream<Arguments> testParameters() {

        return Stream.of(

                arguments(new int[]{1,2,3},new int[]{1,2,4}),
                arguments(new int[]{4,3,2,1},new int[]{4,3,2,2}),
                arguments(new int[]{9},new int[]{1,0}),
                arguments(new int[]{9,8,7,6,5,4,3,2,1,0},new int[]{9,8,7,6,5,4,3,2,1,1}),
                arguments(new int[]{9,9},new int[]{1,0,0})
        );

    }
    @ParameterizedTest
    @MethodSource("testParametersSpecial")
    void plusOneTestSpecial(int[] digits,int[] expectedValue) {
        plusOneTest(digits,expectedValue);
    }
    static Stream<Arguments> testParametersSpecial() {

        return Stream.of(
                arguments(new int[]{9,9},new int[]{1,0,0})
        );

    }
}