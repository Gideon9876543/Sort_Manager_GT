package com.sparta.IndvProj.model;

public class BubbleSortFactory extends SorterFactory{

    @Override
    public Sorter getInstance() {
        return new BubbleSort();
    }
}
