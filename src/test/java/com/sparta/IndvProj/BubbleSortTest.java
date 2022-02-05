package com.sparta.IndvProj;

import com.sparta.IndvProj.controller.SortManager;
import com.sparta.IndvProj.model.BubbleSort;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

//import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testSort() {
        BubbleSort tester = new BubbleSort();
        int[] expected = new int[]{-1, 0, 8};
        assertArrayEquals(expected, tester.sort(new int[]{0, -1, 8}));

    }





//    private SortManager controller;
//    @BeforeEach
//    public void setUp() {controller = new SortManager();}
//
//    public int[] copyArray(int[] originalArray){
//        int[] inputArrayCopy = originalArray.clone();
//        Arrays.sort(inputArrayCopy);
//        return inputArrayCopy;
//    }
//
//    @Test
//    public void testBubble() {
//        int[] inputArray = new int[40];
//        for(int i = 0; i < inputArray.length; i++){
//            inputArray[i] = (int)Math.floor((Math.random()*100)+1);
//        }
//        int[] inputArrayCopy = copyArray(inputArray);
//        int[] result = controller.sortArray("b", inputArray);
//        String expected = Arrays.toString(result);
//        String actual = Arrays.toString(inputArrayCopy);
//        Assertions.assertEquals(expected, actual);
//    }
}