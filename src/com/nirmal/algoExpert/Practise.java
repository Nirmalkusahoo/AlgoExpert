package com.nirmal.algoExpert;


import java.util.*;

public class Practise {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
        }
    }

    public static class BST {
        int value;
        BST left;
        BST right;

        BST(int value) {
            this.value = value;
        }

        public void add(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    this.add(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    this.add(value);
                }
            }
        }
    }


    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static boolean balancedBrackets(String str) {
        // Write your code here.
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put(']', '[');
        bracketMap.put('}', '{');

        String opening = "({[";
        String closing = ")}]";

        List<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char bracket = str.charAt(i);
            if (opening.indexOf(bracket) != -1) {
                stack.add(bracket);
            } else if (closing.indexOf(bracket) != -1) {
                if (stack.size() == 0) {
                    return false;
                }
                if (bracketMap.get(bracket) != stack.get(stack.size() - 1)) {
                    return false;
                } else {
                    stack.remove(stack.size() - 1);
                }
            }
        }
        return stack.size() == 0;
    }

    public static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        Node(String name) {
            this.name = name;
        }


    }

    public static void main(String[] args) {
        System.out.println(balancedBrackets("([])(){}(())()()"));
    }
}
