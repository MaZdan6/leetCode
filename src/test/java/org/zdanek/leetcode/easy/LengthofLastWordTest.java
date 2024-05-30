package org.zdanek.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LengthofLastWordTest {


    @ParameterizedTest
    @MethodSource("testParameters")
    void lengthOfLastWordTest(String s,int expectedValue) {

        System.out.println("    s: "+ s);
        LengthofLastWord solution = new LengthofLastWord();
        int output=solution.lengthOfLastWord(s);


        System.out.println("expected: "+ expectedValue);
        System.out.println("  actual: "+ output);
        assertEquals(expectedValue, output);

    }


    static Stream<Arguments> testParameters() {

        return Stream.of(
                arguments("Hello World",5),
                arguments("   fly me   to   the moon  ",4),
                arguments("luffy is still joyboy",6)
        );

    }
    @ParameterizedTest
    @MethodSource("testParametersSpecial")
    void lengthOfLastWordTestSpecial(String s,int expectedValue) {
        lengthOfLastWordTest(s,expectedValue);
    }
    static Stream<Arguments> testParametersSpecial() {

        return Stream.of(
                arguments("Hello World",5)
        );

    }
}