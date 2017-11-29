package com.github.mantelsolutions.javasolutions1617;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Negative Array task.
 */
public class NegativeArray {

    /**
     * Filters the given array for negative numbers and returns an array of those negative {@link Integer}.
     * This implementation uses functional programming.
     *
     * @param arrayToFilter array of {@link Integer}
     * @return array of negative {@link Integer} found in the given array.
     */
    public Integer[] filterNegativeArrayFunctional(Integer[] arrayToFilter) {
        return Arrays.stream(arrayToFilter).filter(number -> number < 0).toArray(Integer[]::new);
    }

    /**
     * Filters the given array for negative numbers and returns an array of those negative {@link Integer}.
     * This implementation uses iterative programming.
     *
     * @param arrayToFilter array of {@link Integer}
     * @return array of negative {@link Integer} found in the given array.
     */
    public Integer[] filterNegativeArrayIterative(Integer[] arrayToFilter) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer number : arrayToFilter) {
            if (number < 0) {
                resultList.add(number);
            }
        }

        return resultList.toArray(new Integer[resultList.size()]);
    }
}
