package com.sparta.IndvProj.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSortFactory extends SorterFactory{
    private static Logger logger = LogManager.getLogger("Bubble factory getting the Bubble sort instance");

    @Override
    public Sorter getInstance() {
        logger.info("Bubble sort instance obtained using -> getInstance");
        return new BubbleSort();
    }
}
