package com.nirmal.algoExpert.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NodeDepths {
   public static class BinaryTree{
       public int value;
       public BinaryTree left;
       public BinaryTree right;
       BinaryTree(int value){
           this.value=value;
           this.left=null;
           this.right=null;
       }
    }

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        return findDepth(root,0);
    }

    public static int findDepth(BinaryTree root,int depth){
       if(root ==null){
           return 0;
        }
       return depth + findDepth(root.left ,depth+1) +findDepth(root.right,depth+1);
    }

//    Solution 2
    public static int getDepth(BinaryTree root){
       int sumOfDepth=0;
        List<Level> stack= new ArrayList<>();
        stack.add(new Level(root,0));
        while (stack.size()>1){
            Level top=stack.remove(stack.size()-1);
            BinaryTree node=top.root;
            int depth=top.depth;
            if(node==null){
                continue;
            }
            sumOfDepth=sumOfDepth+top.depth;
            stack.add(new Level(root.left,depth+1));
            stack.add(new Level(root.right,depth+1));
        }
        return sumOfDepth;
    }
    public static class Level{
       BinaryTree root;
       int depth;
       Level(BinaryTree root,int depth){
           this.root=root;
           this.depth=depth;
       }
    }
}
