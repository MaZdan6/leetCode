package org.zdanek.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RemoveElementTest {

    @ParameterizedTest
    @MethodSource("testParameters")
    void genericTest(int[] nums, int val, int expectedValue, int[] expectedNums) {

        System.out.println("    nums: "+ Arrays.toString(nums));
        System.out.println("    val: "+ val);
        RemoveElement solution = new RemoveElement();
        int output=solution.removeElement(nums,val);


        System.out.println("expected: "+ expectedValue);
        System.out.println("  actual: "+ output);
        System.out.println("    nums: "+ Arrays.toString(nums));
        assertEquals(expectedValue, output);



        /*for (int i = 0; i < output; i++) {
            assert nums[i] == expectedNums[i];
        }
        for (int i = 0; i < output; i++) {
            assert nums[i] == expectedNums[i];
        }*/

    }


    static Stream<Arguments> testParameters() {

        return Stream.of(
                arguments(new int[]{3,2,2,3},3,2, new int[]{2,2}),
                arguments(new int[]{0,1,2,2,3,0,4,2},2,5, new int[]{0,1,4,0,3})
        );

    }
    @ParameterizedTest
    @MethodSource("testParametersSpecific")
    void specificTest(int[] nums, int val, int expectedValue, int[]expectedNums) {
        genericTest(nums,val,expectedValue,expectedNums);
    }
    static Stream<Arguments> testParametersSpecific() {

        return Stream.of(
                arguments(new int[]{0,1,2,2,3,0,4,2},2,5, new int[]{0,1,4,0,3})
        );

    }
}