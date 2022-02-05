package com.sparta.IndvProj.controller;

import com.sparta.IndvProj.model.BubbleSortFactory;
import com.sparta.IndvProj.model.MergeSortFactory;
import com.sparta.IndvProj.model.Sorter;
import com.sparta.IndvProj.model.SorterFactory;

public class SortManager {

    public int[] sortArray(String desiredSortType) {
        Sorter s = getSorter(desiredSortType);
        int[] arr = new int[40];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.floor((Math.random()*100)+1);
        }
        return s.sort(arr);
    }



//    public int[] initiateSorting(String desiredSortType) {
//        Sorter s = getSorter(desiredSortType);
//        return s.sort();
//    }
    public static Sorter getSorter(String sorterType) {
        SorterFactory sf = switch (sorterType.toLowerCase()) {
            case "b" -> new BubbleSortFactory();
            case "m" -> new MergeSortFactory();
            default -> null;
        };
        return sf.getInstance();
    }

}
