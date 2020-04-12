package com.algorithm.S20200207;

import java.util.Arrays;

/**
 * Solution
 */
public class Solution {

    public int solution(String[] args) {
        int[] numbers = Arrays
                .stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        int fixed = numbers[0];
        int costPerOne = numbers[2] - numbers[1];

        int result = -1;

        try {
            result = fixed / costPerOne + 1;
        } catch (Exception e) { }

        return result;
    }
}
