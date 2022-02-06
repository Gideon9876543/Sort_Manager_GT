package com.sparta.IndvProj;

import com.sparta.IndvProj.controller.SortManager;
import com.sparta.IndvProj.model.BubbleSort;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

//import java.util.Arrays;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BubbleSortTest {


    @Test
    @DisplayName("BubbleSort returns a sorted array of input consisting of positive and negative values")
    public void testBubbleSortWithNegativeAndPositiveValues() {
        BubbleSort tester = new BubbleSort();
        int[] expected = new int[]{-1, 0, 8};
        assertArrayEquals(expected, tester.sort(new int[]{0, -1, 8}));

    }

    @Test
    @DisplayName("BubbleSort returns a sorted array of input consisting of positive values")
    public void testBubbleSortWithPositiveValues() {
        BubbleSort bso = new BubbleSort();
        int[] tester = {40, 48, 29, 65, 39, 75};
        assertArrayEquals(new int[]{29, 39, 40, 48, 65, 75}, bso.sort(tester));
    }

    @Test
    @DisplayName("BubbleSort returns a sorted array of input consisting of negative values")
    public void testBubbleSortWithNegativeValues() {
        BubbleSort bso = new BubbleSort();
        int[] tester = {-40, -48, -29, -65, -39, -75};
        assertArrayEquals(new int[]{-75, -65, -48, -40, -39, -29}, bso.sort(tester));
    }

    @Test
    @DisplayName("BubbleSort returns a sorted array of input consisting of zero values")
    public void testBubbleSortWithManyZeroValues() {
        BubbleSort bso = new BubbleSort();
        int[] tester = {0, 0, 0, 0, 0, 0};
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, bso.sort(tester));
    }
    @Test
    @DisplayName("BubbleSort returns a statement after a null pointer exception is thrown")
    public void givenNullArray_BubbleSort_ReturnsANullPointerException(){
        BubbleSort bso = new BubbleSort();
        int[] testInput = null;
        NullPointerException npe = assertThrows(NullPointerException.class, () -> bso.sort(testInput), "No exception thrown");
    }
}