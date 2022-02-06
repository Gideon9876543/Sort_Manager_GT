package com.sparta.IndvProj.controller;

import com.sparta.IndvProj.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

public class SortManager {
    private static Logger logger = LogManager.getLogger("Sort Manager Logger");

    public int[] sortArray(String desiredSortType) {
        logger.info("Calling the desired input method");
        Sorter s = getSorter(desiredSortType);
        int[] arr = new int[40];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor((Math.random() * 100) + 1);
        }
        logger.info("Array of random integers have been created");
        return s.sort(arr);
    }
    public static Sorter getSorter(String sorterType) {
        logger.info("Call getSort Reference");
        SorterFactory sf = null;
        if ("b".equals(sorterType.toLowerCase())) {
            sf = new BubbleSortFactory();
        }
        else if ("m".equals(sorterType.toLowerCase())) {
            sf = new MergeSortFactory();
        }
        else if ("t".equals(sorterType.toLowerCase())) {
            sf = new BSTSortFactory();
        }
        else {
            logger.error("Invalid input - SortFactory Object will be null");

        }
        return sf.getInstance();
    }


}







