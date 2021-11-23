package com.nirmal.algoExpert.binaryTree;

import java.util.ArrayList;

public class FindSuccessor {

    public static class BinaryTree{
        int value;
        BinaryTree left;
        BinaryTree right;
        BinaryTree parent;

        public BinaryTree(int value){
            this.value=value;
        }
    }
    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        // Write your code here.
        ArrayList<BinaryTree> inOrderTraversalOrder=new ArrayList<>();
        getInOrderTraversalOrder(tree,inOrderTraversalOrder);

        for(int i=0;i<inOrderTraversalOrder.size();i++){
            if(inOrderTraversalOrder.get(i) !=node){
                continue;
            }
            if(i == inOrderTraversalOrder.size()-1){
                return null;
            }
            return inOrderTraversalOrder.get(i+1);
        }
        return null;
    }

    void getInOrderTraversalOrder(BinaryTree root, ArrayList<BinaryTree> inOrderTraversalOrder){
        if(root ==null){
            return;
        }
        getInOrderTraversalOrder(root.left,inOrderTraversalOrder);
        inOrderTraversalOrder.add(root);
        getInOrderTraversalOrder(root.right,inOrderTraversalOrder);
    }
}
