package org.zdanek.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ValidParenthesesTest {


    @ParameterizedTest
    @MethodSource("testParameters")
    void isValidTest(String s,boolean expectedValue) {

        System.out.println("    s: "+ s);
        ValidParentheses solution = new ValidParentheses();
        boolean output=solution.isValid(s);


        System.out.println("expected: "+ expectedValue);
        System.out.println("  actual: "+ output);
        assertEquals(expectedValue, output);

    }


    static Stream<Arguments> testParameters() {

        return Stream.of(

                arguments("()",true),
                arguments("()[]{}",true),
                arguments("(]",false),
                arguments("{[]}",true),
                arguments("[",false)

        );

    }
    @ParameterizedTest
    @MethodSource("testParametersSpecial")
    void isValidTestSpecial(String s,boolean expectedValue) {
        isValidTest(s,expectedValue);
    }
    static Stream<Arguments> testParametersSpecial() {

        return Stream.of(
                arguments("{[]}",true)
        );

    }
}