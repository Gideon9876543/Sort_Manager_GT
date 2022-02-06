package com.sparta.IndvProj.view;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {
    private static Logger logger = LogManager.getLogger("Viewer Logger");

    public String getDesiredSorter(){
        System.out.print("Please enter your desired sorting method, 'b' for Bubble Sort, 'm' for Merge Sort and " +
                "'t' for Binary Search Tree (BST) sorting: ");
        Scanner sc = new Scanner(System.in);
        String desiredSortType = sc.next();
        return desiredSortType;
    }


    public void displayResults(int[] result){
        logger.info("Result are shown below: ");
        System.out.println(Arrays.toString(result));
    }
}
