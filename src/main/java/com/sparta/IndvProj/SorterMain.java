package com.sparta.IndvProj;


import com.sparta.IndvProj.controller.SortManager;
import com.sparta.IndvProj.view.DisplayManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SorterMain {
    private static Logger logger = LogManager.getLogger("Sort Manager Logger");

    public static void main(String[] args) {
        DisplayManager view = new DisplayManager();
        String desiredSortType = view.getDesiredSorter();
        SortManager controller = new SortManager();
        logger.info("Sorting algorithm of type: " + desiredSortType + "Created");
        int[] result = controller.sortArray(desiredSortType);
        view.displayResults(result);


    }

}
