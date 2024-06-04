package org.zdanek.leetcode.easy.arraystring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BestTimetoBuyandSellStockTest {
    @ParameterizedTest
    @MethodSource("testParameters")
    void genericTest(int[] prices, int expectedValue) {

        System.out.println("    prices: "+ Arrays.toString(prices));
        BestTimetoBuyandSellStock solution = new BestTimetoBuyandSellStock();
        int output=solution.maxProfit(prices);


        System.out.println("expected: "+ expectedValue);
        System.out.println("  actual: "+ output);
        System.out.println("    prices: "+ Arrays.toString(prices));
        assertEquals(expectedValue, output);


    }


    static Stream<Arguments> testParameters() {

        return Stream.of(
                arguments(new int[]{7,1,5,3,6,4},5),
                arguments(new int[]{7,6,4,3,1},0)
        );

    }
    @ParameterizedTest
    @MethodSource("testParametersSpecific")
    void specificTest(int[] nums,  int expectedValue) {
        genericTest(nums,expectedValue);
    }
    static Stream<Arguments> testParametersSpecific() {

        return Stream.of(
                arguments(new int[]{7,1,5,3,6,4},5)
        );

    }
}