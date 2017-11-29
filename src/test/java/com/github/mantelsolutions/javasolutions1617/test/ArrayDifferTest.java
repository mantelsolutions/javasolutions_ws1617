package com.github.mantelsolutions.javasolutions1617.test;

import com.github.mantelsolutions.javasolutions1617.ArrayDiffer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayDifferTest {

    private ArrayDiffer fixture = new ArrayDiffer();

    @Test
    public void testDiffArrays_Success() {
        String[] leftArray = {"a", "bb", "ccc", "ddddd"};
        String[] rightArray = {"a", "b", "c", "d"};

        int result = this.fixture.diffArrays(leftArray, rightArray);

        assertEquals("The number of difference was not as expected", 2, result);
    }

    @Test
    public void testDiffArrays_StringsAreInRange() {
        String[] leftArray = {"a", "bb", "ccc", "ddddd"};
        String[] rightArray = {"a", "bb", "cc", "dddd"};

        int result = this.fixture.diffArrays(leftArray, rightArray);

        assertEquals("The number of difference was not as expected", 0, result);
    }
}
