package com.sparta.IndvProj;

import com.sparta.IndvProj.model.BubbleSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testSort() {
        BubbleSort tester = new BubbleSort();
        int[] expected = new int[]{-1, 0, 8};
        assertArrayEquals(expected, tester.sort(new int[]{0, -1, 8}));

    }

    @Test
    public void name() {
    }
}