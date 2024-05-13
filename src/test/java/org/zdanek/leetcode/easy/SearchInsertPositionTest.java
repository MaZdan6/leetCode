package org.zdanek.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SearchInsertPositionTest {

    @Test
    void searchInsert() {
    }

    @ParameterizedTest
    @MethodSource("testParameters")
    void searchInsertTest(int[] nums,int target,int expectedValue) {

        System.out.println("    nums: "+ Arrays.toString(nums));
        System.out.println("  target: "+ target);
        SearchInsertPosition solution = new SearchInsertPosition();
        int output=solution.searchInsert(nums,target);


        System.out.println("expected: "+ expectedValue);
        System.out.println("  actual: "+ output);
        assertEquals(expectedValue, output);

    }


    static Stream<Arguments> testParameters() {

        return Stream.of(

                arguments(new int[]{1,3,5,6},5,2),
                arguments(new int[]{1,3,5,6},2,1),
                arguments(new int[]{1,3,5,6},7,4),
                arguments(new int[]{1,3},2,1),
                arguments(new int[]{1,3,5,6},0,0),
                arguments(new int[]{1,3,5},2,1),
                arguments(new int[]{1,2,3,4,5,10},2,1)
        );

    }
    @ParameterizedTest
    @MethodSource("testParametersSpecial")
    void searchInsertTestSpecial(int[] nums,int target,int expectedValue) {
        searchInsertTest(nums,target,expectedValue);
    }
    static Stream<Arguments> testParametersSpecial() {

        return Stream.of(
                arguments(new int[]{1,3},2,1)
        );

    }
}