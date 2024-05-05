package org.zdanek.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.zdanek.leetcode.easy.TwoSums;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

//easy
class TwoSumsTest {

    //testy parametryczne: https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests-sources-MethodSource
    @ParameterizedTest
    @MethodSource("testParameters")
    public void twoSumTest(int target, int[] nums, int[] expectedValue) {

        TwoSums solution = new TwoSums();
        int[] output = solution.twoSum(nums, target);
        assertArrayEquals(expectedValue, output);
    }

    static Stream<Arguments> testParameters() {
        return Stream.of(
                arguments(9, new int[]{2, 7, 11, 15}, new int[]{0, 1}),
                arguments(6, new int[]{3, 2, 4}, new int[]{1, 2}),
                arguments(6, new int[]{3, 3}, new int[]{0, 1})
        );
    }

}