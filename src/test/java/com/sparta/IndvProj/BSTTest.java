package com.sparta.IndvProj;

import com.sparta.IndvProj.model.BST;
import com.sparta.IndvProj.model.BubbleSort;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BSTTest {
    @Test
    @DisplayName("BST sorting returns a sorted array of input consisting of positive and negative values")
    public void testBubbleSortWithNegativeAndPositiveValues() {
        BST tester = new BST();
        int[] expected = new int[]{-1, 0, 8};
        assertArrayEquals(expected, tester.sort(new int[]{0, -1, 8}));

    }

    @Test
    @DisplayName("BST sorting returns a sorted array of input consisting of positive values")
    public void testBubbleSortWithPositiveValues() {
        BST bst = new BST();
        int[] tester = {40, 48, 29, 65, 39, 75};
        assertArrayEquals(new int[]{29, 39, 40, 48, 65, 75}, bst.sort(tester));
    }

    @Test
    @DisplayName("BST sorting returns a sorted array of input consisting of negative values")
    public void testBubbleSortWithNegativeValues() {
        BST bst = new BST();
        int[] tester = {-40, -48, -29, -65, -39, -75};
        assertArrayEquals(new int[]{-75, -65, -48, -40, -39, -29}, bst.sort(tester));
    }

    @Test
    @DisplayName("BST sorting returns a statement after a null pointer exception is thrown")
    public void givenNullArray_BubbleSort_ReturnsANullPointerException(){
        BST bst = new BST();
        int[] testInput = null;
        NullPointerException npe = assertThrows(NullPointerException.class, () -> bst.sort(testInput), "No exception thrown");
    }

}