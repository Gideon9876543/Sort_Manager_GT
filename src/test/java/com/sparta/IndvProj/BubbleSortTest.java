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
    public void testBubbleSortWithNegativeValues() {
        BubbleSort tester = new BubbleSort();
        int[] expected = new int[]{-1, 0, 8};
        assertArrayEquals(expected, tester.sort(new int[]{0, -1, 8}));

    }

    @Test
    @DisplayName("BubbleSort returns a sorted array of some input")
    public void testBubbleSortWithPositiveValues() {
        BubbleSort bso = new BubbleSort();
        int[] tester = {40, 48, 29, 65, 39, 75};
        assertArrayEquals(new int[]{29, 39, 40, 48, 65, 75}, bso.sort(tester));
    }



}