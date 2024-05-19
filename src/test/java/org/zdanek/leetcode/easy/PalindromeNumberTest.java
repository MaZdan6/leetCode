package org.zdanek.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PalindromeNumberTest {

    @ParameterizedTest
    @MethodSource("testParameters")
    void isPalindromeTest(int x,boolean expectedValue) {

        System.out.println("x: "+ x);
        PalindromeNumber solution = new PalindromeNumber();
        boolean output=solution.isPalindrome(x);
        System.out.println("expected:"+ expectedValue);
        System.out.println("  actual:"+ output);
        assertEquals(expectedValue, output);

    }


    static Stream<Arguments> testParameters() {

        return Stream.of(

                arguments(121,true),
                arguments(-121,false),
                arguments(10,false),
                arguments(10022201,false)
        );

    }
    @ParameterizedTest
    @MethodSource("testParametersSpecial")
    void isPalindromeTestSpecial(int x,boolean expectedValue) {
        isPalindromeTest(x,expectedValue);
    }
    static Stream<Arguments> testParametersSpecial() {

        return Stream.of(
                arguments(10022201,false)
        );

    }
}