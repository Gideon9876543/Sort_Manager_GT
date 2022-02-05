package com.sparta.IndvProj.controller;

import com.sparta.IndvProj.model.BubbleSortFactory;
import com.sparta.IndvProj.model.MergeSortFactory;
import com.sparta.IndvProj.model.Sorter;
import com.sparta.IndvProj.model.SorterFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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


    //    public int[] initiateSorting(String desiredSortType) {
//        Sorter s = getSorter(desiredSortType);
//        return s.sort();
//    }
    public static Sorter getSorter(String sortType) {
        logger.info("Call the getSorter methods");

        SorterFactory sf;
        if ("b".equals(sortType)) {
            sf = new BubbleSortFactory();
        } else if ("m".equals(sortType)) {
            sf = new MergeSortFactory();
        } else {
            logger.error("Invalid input so Sorter Factory object will be null");
            sf = null;
        }
        return sf.getInstance();
    }
}




//    public static Sorter getSorter(String sorterType) {
//        logger.info("Calling the getSorter methods");
//        SorterFactory sf = switch (sorterType.toLowerCase()) {
//            case "b" -> new BubbleSortFactory();
//            case "m" -> new MergeSortFactory();
//            default -> null;
//        };
//        return sf.getInstance();
//    }


