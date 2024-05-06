package org.zdanek.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RemoveDuplicatesTest {

    @ParameterizedTest
    @MethodSource("testParameters")
    void removeDuplicates(int[] nums, int expectedValue) {

        RemoveDuplicates removeDuplicates= new RemoveDuplicates();
        int output= removeDuplicates.removeDuplicates(nums);
        assertEquals(expectedValue,output);

    }

    static Stream<Arguments> testParameters() {
        return Stream.of(
                arguments(new int[]{1, 1, 2}, 2),
                arguments(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5)
        );
    }
}