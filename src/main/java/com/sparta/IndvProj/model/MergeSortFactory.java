package com.sparta.IndvProj.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MergeSortFactory extends SorterFactory{

    private static Logger logger = LogManager.getLogger("Merge factory getting the Merge sort instance");

    @Override
    public Sorter getInstance() {
        logger.info("Merge sort instance obtained using -> getInstance");
        return new MergeSort();
    }
}
