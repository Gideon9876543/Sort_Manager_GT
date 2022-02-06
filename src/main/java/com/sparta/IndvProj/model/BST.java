package com.sparta.IndvProj.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BST implements Sorter{
    private static Logger logger = LogManager.getLogger("Binary Search Tree (BST) methodology");

    public class Node {
        int number;
        Node left, right;


        Node(int num) {
            number = num;
            left = right = null;

        }
    }

    public class BinarySearchTree {
        Node root;
        ArrayList<Integer> list = new ArrayList<>();
        public BinarySearchTree createBST(int[] array) {
            HashSet<Integer> input = new HashSet<>();
            for (int i = 0; i  < array.length; i++){
                if (!input.contains(array[i])){
                    input.add(array[i]);
                }
            }
            int[] theArray = new int[input.size()];
            int i = 0;
            for (int number : input) {
                theArray[i++] = number;
            }
            BinarySearchTree bst = new BinarySearchTree();
            for(int j = 0; j < array.length; j++) {
                bst.addToBST(array[j]);
            }
            return bst;
        }
        private void addToBST(int number) {
            root = addRepeat(root, number);
        }
        private Node addRepeat(Node currently, int number) {
            if (currently == null) {
                return new Node(number);
            }
            if (number < currently.number) {
                currently.left = addRepeat(currently.left, number);
            }
            else if (number > currently.number) {
                currently.right = addRepeat(currently.right, number);
            }
            else {
                return currently;
            }
            return currently;
        }
        private void orderOf(Node node) {
            if (node != null) {
                orderOf(node.left);
                list.add(node.number);
                orderOf(node.right);
            }
        }
    }
    @Override
    public int[] sort(int[] array) {
        logger.info("Binary Tree Sorting algorithm started");
        long start = System.nanoTime();
        if (array.length == 0) {
            return array;
        }
        BinarySearchTree bstInstance = new BinarySearchTree();
        BinarySearchTree bstResult = bstInstance.createBST(array);
        bstResult.orderOf(bstResult.root);
        int[] arrayReturn = new int[bstResult.list.size()];
        for (int i=0; i < arrayReturn.length; i++) {
            arrayReturn[i] = bstResult.list.get(i).intValue();
        }
        long end = System.nanoTime();
        logger.info("It took " + (TimeUnit.MICROSECONDS.convert(end-start, TimeUnit.NANOSECONDS)) + " milliseconds to run the Binary Search Tree sort algorithm");
        return arrayReturn;
    }
}










