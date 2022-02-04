package com.sparta.IndvProj;

import java.util.Arrays;
import java.util.Random;




public class TaskOne {
    public static void main(String[] args) {
//        int[] numbers = new int[20];
//        for(int i = 0; i < numbers.length; i++) {
//            Random random = new Random();
//            int rand = random.nextInt(101);
//            numbers[i] = rand;

//        }
        int[] num = {2, 3, 78, 50, 17, 76, 32, 32, 38, 11, 54, 55, 80, 66, 76, 29, 9, 61, 96, 98};
        for (int x = 0; x < num.length; x++) {
            System.out.print(num[x] + " ");
        }
        System.out.println("\n");
        System.out.println("After Bubble Sorting: ");
        int[] numbers = {2, 3, 78, 50, 17, 76, 32, 32, 38, 11, 54, 55, 80, 66, 76, 29, 9, 61, 96, 98};
        for (int x = 0; x < numbers.length; x++) {
            BubbleSort sorter = new BubbleSort();
            sorter.sort(numbers);
            System.out.print(numbers[x] + " ");

//            System.out.println(Arrays.toString(numbers));
        }
        System.out.print("\n");
        System.out.println("After Merge Sorting: ");

        int[] number = {2, 3, 78, 50, 17, 76, 32, 32, 38, 11, 54, 55, 80, 66, 76, 29, 9, 61, 96, 98};
        for (int x = 0; x < number.length; x++) {
            MergeSort sorted = new MergeSort();
            sorted.mergeSort(number);
            System.out.print(number[x] + " ");
        }

    }







}
