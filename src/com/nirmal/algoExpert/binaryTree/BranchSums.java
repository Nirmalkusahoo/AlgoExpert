package com.nirmal.algoExpert.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
    public static class BinaryTree{
        int value;
        BinaryTree left;
        BinaryTree right;
        BinaryTree(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }

        public static List<Integer> branchSums(BinaryTree root) {
            // Write your code here.
            List<Integer> sums= new ArrayList<Integer>();
           calculateSum(root,0,sums);


            return sums;
        }

        public static void  calculateSum(BinaryTree root,int newSum,List<Integer> sums){
            if(root == null){
                return;
            }
            newSum = newSum + root.value;
            if(root.left == null && root.right == null){
                sums.add(newSum);
                return;
            }
            calculateSum(root.left,newSum,sums);
            calculateSum(root.right,newSum,sums);
        }
    }
}
