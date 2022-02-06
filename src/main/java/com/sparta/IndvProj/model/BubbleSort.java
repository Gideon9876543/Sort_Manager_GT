package com.sparta.IndvProj.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.TimeUnit;

public class BubbleSort implements Sorter {
    private static Logger logger = LogManager.getLogger("Bubble sort methodology");



    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    @Override
    public int[] sort(int[] array) {
        long start = System.nanoTime();

        for(var i = 0; i < array.length; i++) {
            for(var j = 1; j < array.length; j++ ){
                if(array[j] < array[j - 1]) {
                    swap(array, j, j-1);
//                    var temp = array[j];
//                    array[j] = array[j-1];
//                    array[j-1] = temp;

                }

            }
        }
        long end = System.nanoTime();
        logger.info("It took " + (TimeUnit.MICROSECONDS.convert(end-start, TimeUnit.NANOSECONDS)) + " milliseconds to run the Bubble sort algorithm");
        return array;
    }


}
