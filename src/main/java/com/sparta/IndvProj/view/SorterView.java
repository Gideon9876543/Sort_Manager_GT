package com.sparta.IndvProj.view;

import java.util.Arrays;
import java.util.Scanner;

public class SorterView {
    public String getDesiredSorter(){
        System.out.print("Please enter your desired sorting method: ");
        Scanner sc = new Scanner(System.in);
        String desiredSortType = sc.next();
        return desiredSortType;
    }


    public void displayResults(int[] result){
        System.out.println(Arrays.toString(result));
    }
}
