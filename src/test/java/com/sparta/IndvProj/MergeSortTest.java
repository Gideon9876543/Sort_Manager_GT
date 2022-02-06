package com.sparta.IndvProj;

import com.sparta.IndvProj.model.BST;
import com.sparta.IndvProj.model.BubbleSort;
import com.sparta.IndvProj.model.MergeSort;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MergeSortTest {

    @Test
    @DisplayName("MergeSort returns a sorted array of input consisting of positive and negative values")
    public void testBubbleSortWithNegativeAndPositiveValues() {
        MergeSort tester = new MergeSort();
        int[] expected = new int[]{-1, 0, 8};
        assertArrayEquals(expected, tester.sort(new int[]{0, -1, 8}));

    }

    @Test
    @DisplayName("MergeSort sorting returns a sorted array of input consisting of positive values")
    public void testBubbleSortWithPositiveValues() {
        MergeSort mst = new MergeSort();
        int[] tester = {40, 48, 29, 65, 39, 75};
        assertArrayEquals(new int[]{29, 39, 40, 48, 65, 75}, mst.sort(tester));
    }

    @Test
    @DisplayName("MergeSort sorting returns a sorted array of input consisting of negative values")
    public void testBubbleSortWithNegativeValues() {
        MergeSort mst = new MergeSort();
        int[] tester = {-40, -48, -29, -65, -39, -75};
        assertArrayEquals(new int[]{-75, -65, -48, -40, -39, -29}, mst.sort(tester));
    }

    @Test
    @DisplayName("MergeSort returns a sorted array of input consisting of zero values")
    public void testBubbleSortWithManyZeroValues() {
        MergeSort mst = new MergeSort();
        int[] tester = {0, 0, 0, 0, 0, 0};
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, mst.sort(tester));
    }

    @Test
    @DisplayName("MergeSort returns a statement after a null pointer exception is thrown")
    public void givenNullArray_BubbleSort_ReturnsANullPointerException(){
        MergeSort mst = new MergeSort();
        int[] testInput = null;
        NullPointerException npe = assertThrows(NullPointerException.class, () -> mst.sort(testInput), "No exception thrown");
    }
}

