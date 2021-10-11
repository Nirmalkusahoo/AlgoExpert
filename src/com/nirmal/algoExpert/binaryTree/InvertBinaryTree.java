package com.nirmal.algoExpert.binaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class InvertBinaryTree {

    public static class BinaryTree{
            int value;
            BinaryTree left;
            BinaryTree right;
            BinaryTree(int value){
                this.value=value;
            }
    }

    public static void invertBinaryTree(BinaryTree tree) {
        // Write your code here.
        if(tree ==null){
            return;
        }
        swap(tree);
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    public static void swap(BinaryTree tree){
        BinaryTree left=tree.left;
        tree.left=tree.right;
        tree.right=left;
    }

    // Solution 2 : Iterative
    /*public static void invertBinaryTree(BinaryTree tree) {
        // Write your code here.

        ArrayDeque<BinaryTree> queue=new ArrayDeque<BinaryTree>();
        queue.addLast(tree);
       while (queue.size()>0){
           BinaryTree current= queue.pollFirst();
           swap(current);
           if(current.left !=null){
               queue.addLast(current.left);
           }
           if(current.right !=null){
               queue.addLast(current.right);
           }
       }
    }*/
}
