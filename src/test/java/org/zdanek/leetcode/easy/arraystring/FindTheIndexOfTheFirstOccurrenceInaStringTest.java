package org.zdanek.leetcode.easy.arraystring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindTheIndexOfTheFirstOccurrenceInaStringTest {

    @ParameterizedTest
    @MethodSource("testParameters")
    void genericTest(String haystack, String needle, int expectedValue) {

        System.out.println("    haystack: " + haystack);
        System.out.println("    needle: " + needle);
        FindTheIndexOfTheFirstOccurrenceInaString solution = new FindTheIndexOfTheFirstOccurrenceInaString();
        int output = solution.strStr(haystack, needle);


        System.out.println("expected: " + expectedValue);
        System.out.println("  actual: " + output);
        assertEquals(expectedValue, output);


    }


    static Stream<Arguments> testParameters() {

        return Stream.of(
                arguments("sadbutsad", "sad", 0),
                arguments("leetcode", "leeto", -1)

        );

    }

    @ParameterizedTest
    @MethodSource("testParametersSpecific")
    void specificTest(String haystack, String needle, int expectedValue) {
        genericTest(haystack, needle, expectedValue);
    }

    static Stream<Arguments> testParametersSpecific() {

        return Stream.of(
                arguments("sadbutsad", "sad", 0)
        );

    }
}