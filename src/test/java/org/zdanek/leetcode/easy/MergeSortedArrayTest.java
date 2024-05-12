package org.zdanek.leetcode.easy;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.Arguments;

import org.junit.jupiter.params.provider.MethodSource;


import java.util.Arrays;
import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import static org.junit.jupiter.params.provider.Arguments.arguments;


class MergeSortedArrayTest {


    @ParameterizedTest
    @MethodSource("testParameters")
    void mergeTest(int[] nums1, int m, int[] nums2, int n, int[] expectedValue) {

        MergeSortedArray solution = new MergeSortedArray();
        solution.merge(nums1, m, nums2, n);
        System.out.println("a:"+Arrays.toString(nums1));
        System.out.println("e:"+Arrays.toString(expectedValue));
        assertArrayEquals(expectedValue, nums1);

    }


    static Stream<Arguments> testParameters() {

        return Stream.of(

                arguments(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6}),

                arguments(new int[]{1}, 1, new int[]{1}, 0, new int[]{1}),

                arguments(new int[]{0}, 0, new int[]{1}, 1, new int[]{1}),
                arguments(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3, new int[]{1, 2, 3, 4, 5, 6}),
                arguments(new int[]{-1,0,0,3,3,3,0,0,0}, 6, new int[]{1, 2, 2}, 3, new int[]{-1,0,0,1,2,2,3,3,3}),
                arguments(new int[]{-1,0,0,0,3,0,0,0,0,0,0}, 5, new int[]{-1,-1,0,0,1,2}, 6, new int[]{-1,-1,-1,0,0,0,0,0,1,2,3}),
                arguments(new int[]{-10,-10,-9,-9,-9,-8,-8,-7,-7,-7,-6,-6,-6,-6,-6,-6,-6,-5,-5,-5,-4,-4,-4,-3,-3,-2,-2,-1,-1,0,1,1,1,2,2,2,3,3,3,4,5,5,6,6,6,6,7,7,7,7,8,9,9,9,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                        , 55, new int[]{-10,-10,-9,-9,-9,-9,-8,-8,-8,-8,-8,-7,-7,-7,-7,-7,-7,-7,-7,-6,-6,-6,-6,-5,-5,-5,-5,-5,-4,-4,-4,-4,-4,-3,-3,-3,-2,-2,-2,-2,-2,-2,-2,-1,-1,-1,0,0,0,0,0,1,1,1,2,2,2,2,2,2,2,2,3,3,3,3,4,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,6,6,7,7,7,7,7,7,7,8,8,8,8,9,9,9,9}
                        , 99
                        , new int[]{-10,-10,-10,-10,-9,-9,-9,-9,-9,-9,-9,-8,-8,-8,-8,-8,-8,-8,-7,-7,-7,-7,-7,-7,-7,-7,-7,-7,-7,-6,-6,-6,-6,-6,-6,-6,-6,-6,-6,-6,-5,-5,-5,-5,-5,-5,-5,-5,-4,-4,-4,-4,-4,-4,-4,-4,-3,-3,-3,-3,-3,-2,-2,-2,-2,-2,-2,-2,-2,-2,-1,-1,-1,-1,-1,0,0,0,0,0,0,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,9,9})


        );

    }
    @ParameterizedTest
    @MethodSource("testParametersSpecial")
    void mergeTestSpecial(int[] nums1, int m, int[] nums2, int n, int[] expectedValue) {

        MergeSortedArray solution = new MergeSortedArray();
        solution.merge(nums1, m, nums2, n);
        System.out.println("a:"+Arrays.toString(nums1));
        System.out.println("e:"+Arrays.toString(expectedValue));
        assertArrayEquals(expectedValue, nums1);

    }


    static Stream<Arguments> testParametersSpecial() {

        return Stream.of(
                arguments(new int[]{0}, 0, new int[]{1}, 1, new int[]{1})
        );

    }

}