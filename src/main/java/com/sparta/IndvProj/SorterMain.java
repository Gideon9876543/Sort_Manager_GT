package com.sparta.IndvProj;


import com.sparta.IndvProj.controller.SortManager;
import com.sparta.IndvProj.view.DisplayManager;

public class SorterMain {
    public static void main(String[] args) {
        DisplayManager view = new DisplayManager();
        String desiredSortType = view.getDesiredSorter();
        SortManager controller = new SortManager();
        int[] result = controller.sortArray(desiredSortType);
        view.displayResults(result);
//        Sorter s = getSorter(desiredSortType);
//        s.sorting();
    }
//        int[] numbers = new int[20];
//        for(int i = 0; i < numbers.length; i++) {
//            Random random = new Random();
//            int rand = random.nextInt(101);
//            numbers[i] = rand;
//    public static Sorter getSorter(String sorterType) {
//        SorterFactory sf = switch (sorterType.toLowerCase()) {
//            case "b" -> new BubbleSortFactory();
//            case "m" -> new MergeSortFactory();
//            default -> null;
//        };
//        return sf.getInstance();
//
//
//
//
//
//        int[] num = {2, 3, 78, 50, 17, 76, 32, 32, 38, 11, 54, 55, 80, 66, 76, 29, 9, 61, 96, 98};
//        for(int x = 0; x < num.length; x++) {
//            System.out.print(num[x] + " ");
//        }
//        System.out.println("\n");
//        System.out.println("After Bubble Sorting: ");
//        int[] numbers = {2, 3, 78, 50, 17, 76, 32, 32, 38, 11, 54, 55, 80, 66, 76, 29, 9, 61, 96, 98};
//        for (int x = 0; x < numbers.length; x++) {
//            BubbleSort sorter = new BubbleSort();
//            sorter.sort(numbers);
//            System.out.print(numbers[x] + " ");
//
////            System.out.println(Arrays.toString(numbers));
//        }
//        System.out.print("\n");
//        System.out.println("After Merge Sorting: ");
//        int[] number = {2, 3, 78, 50, 17, 76, 32, 32, 38, 11, 54, 55, 80, 66, 76, 29, 9, 61, 96, 98};
//        for (int x = 0; x < number.length; x++) {
//            MergeSort sorted = new MergeSort();
//            sorted.mergeSort(number);
//            System.out.print(number[x] + " ");
//        }

//    }

}
