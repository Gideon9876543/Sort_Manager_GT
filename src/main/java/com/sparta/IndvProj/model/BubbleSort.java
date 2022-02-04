package com.sparta.IndvProj.model;

public class BubbleSort implements Sorter {



    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    @Override
    public int[] sort(int[] array) {

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
        return array;
    }


}
