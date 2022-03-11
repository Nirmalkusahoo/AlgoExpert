package com.nirmal.algoExpert.binaryTree;

import com.nirmal.algoExpert.Practise;

import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTree {
    public static BinaryTree flattenBinaryTree(BinaryTree root) {
        // Write your code here.

        List<BinaryTree> list= new ArrayList<>();
        doInOrderTraversal(root,list);

        for(int i=0;i<list.size()-1;i++){
            BinaryTree left=list.get(i);
            BinaryTree right=list.get(i+1);
            left.right=right;
            right.left=left;
        }
        return list.get(0);
    }

    public static void doInOrderTraversal(BinaryTree tree,List<BinaryTree> list){
        if(tree==null){
            return;
        }
        doInOrderTraversal(tree.left,list);
        list.add(tree);
        doInOrderTraversal(tree.right,list);
    }
    public static class BinaryTree{
        int value;
        BinaryTree left;
        BinaryTree right;
        BinaryTree(int value){
            this.value=value;
        }
    }
}
