package com.nirmal.general;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    public TreeNode root;

    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
        }
    }

    public void createBinaryTree(){
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode three=new TreeNode(3);
        TreeNode four=new TreeNode(4);
        root=first;
        first.left=second;
        first.right=three;
        second.left=four;
    }

    public void preOrder(TreeNode root){
        if(root ==null){
            return;
        }
        System.out.print(root.data+"  ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void preOrderIterative(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack= new Stack();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.print(temp.data+"  ");
            if(temp.right !=null){
                stack.push(temp.right);
            }
            if(temp.left !=null){
                stack.push(temp.left);
            }
        }

    }

    public void iterativeInOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }
        Stack<TreeNode> stack= new Stack();
        TreeNode temp=root;
        while(!stack.isEmpty() || temp !=null){
            if(temp !=null){
                stack.push(temp);
                temp=temp.left;
            } else {
                temp=stack.pop();
                System.out.print(temp.data+ "  ");
                temp=temp.right;
            }
        }
    }

    public void recursiveInOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        recursiveInOrderTraversal(root.left);
        System.out.println(root.data);
        recursiveInOrderTraversal(root.right);
    }

    public void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            System.out.print(temp.data+ " ");
            if(temp.left !=null){
                queue.offer(temp.left);
            }
            if(temp.right !=null){
                queue.offer(temp.right);
            }
        }

    }
    public static void main(String[] args) {
        BinaryTree obj= new BinaryTree();
        obj.createBinaryTree();
        obj.preOrder(obj.root);
        System.out.println("");
        obj.preOrderIterative(obj.root);
    }
}
