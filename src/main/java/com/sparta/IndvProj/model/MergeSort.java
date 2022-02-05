package com.sparta.IndvProj.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class MergeSort implements Sorter{
    private static Logger logger = LogManager.getLogger("Merge sort methodology");

    public static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }

    @Override
    public int[] sort(int[] array) {
        long start = System.nanoTime();
        int inputLength = array.length;

        if (inputLength < 2) {
            return array;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = array[i];
        }

        sort(leftHalf);
        sort(rightHalf);

        merge(array, leftHalf, rightHalf);
        long end = System.nanoTime();
        logger.info("It took " + (TimeUnit.MICROSECONDS.convert(end-start, TimeUnit.NANOSECONDS)) + " milliseconds to run the Merge sort algorithm");
        return array;
    }

}
