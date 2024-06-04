package org.zdanek.leetcode.easy.arraystring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.zdanek.leetcode.easy.RemoveElement;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MajorityElementTest {

    @ParameterizedTest
    @MethodSource("testParameters")
    void genericTest(int[] nums, int expectedValue) {

        System.out.println("    nums: "+ Arrays.toString(nums));
        MajorityElement solution = new MajorityElement();
        int output=solution.majorityElement(nums);


        System.out.println("expected: "+ expectedValue);
        System.out.println("  actual: "+ output);
        System.out.println("    nums: "+ Arrays.toString(nums));
        assertEquals(expectedValue, output);


    }


    static Stream<Arguments> testParameters() {

        return Stream.of(
                arguments(new int[]{3,2,3},3),
                arguments(new int[]{2,2,1,1,1,2,2},2)
        );

    }
    @ParameterizedTest
    @MethodSource("testParametersSpecific")
    void specificTest(int[] nums,  int expectedValue) {
        genericTest(nums,expectedValue);
    }
    static Stream<Arguments> testParametersSpecific() {

        return Stream.of(
                arguments(new int[]{3,2,3},3)
        );

    }
}