package org.zdanek.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RomanToIntegerTest {

    @ParameterizedTest
    @MethodSource("testParameters")
    public void romantToIntTest(String romanNumber, int expectedValue) {

        RomanToInteger solution = new RomanToInteger();
        int output = solution.romanToInt(romanNumber);
        assertEquals(expectedValue, output);
    }

    static Stream<Arguments> testParameters() {
        return Stream.of(
                arguments("III", 3),
                arguments("LVIII", 58),
                arguments("MCMXCIV", 1994)

        );
    }

}