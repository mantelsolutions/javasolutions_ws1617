package com.github.mantelsolutions.javasolutions1617.test;

import com.github.mantelsolutions.javasolutions1617.NegativeArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NegativeArrayTest {

    private NegativeArray fixture = new NegativeArray();

    @Test
    public void testfilterNegativeArrayFunctional_Success() {
        Integer[] inputToFilter = {1, 2, 3, -1, 4, -5, 7};

        Integer[] result = this.fixture.filterNegativeArrayFunctional(inputToFilter);

        Integer[] expectedResult = {-1, -5};
        assertEquals("The array was not as expected.", expectedResult, result);
    }

    @Test
    public void testfilterNegativeArrayFunctional_OnlyPositiveInputs() {
        Integer[] inputToFilter = {1, 2, 3};

        Integer[] result = this.fixture.filterNegativeArrayFunctional(inputToFilter);

        Integer[] expectedResult = {};
        assertEquals("The array was not as expected.", expectedResult, result);
    }

    @Test
    public void testfilterNegativeArrayIterativeSuccess() {
        Integer[] inputToFilter = {1, 2, 3, -1, 4, -5, 7};

        Integer[] result = this.fixture.filterNegativeArrayIterative(inputToFilter);

        Integer[] expectedResult = {-1, -5};
        assertEquals("The array was not as expected.", expectedResult, result);
    }

    @Test
    public void testfilterNegativeArrayIterative_OnlyPositiveInputs() {
        Integer[] inputToFilter = {1, 2, 3};

        Integer[] result = this.fixture.filterNegativeArrayIterative(inputToFilter);

        Integer[] expectedResult = {};
        assertEquals("The array was not as expected.", expectedResult, result);
    }

}
