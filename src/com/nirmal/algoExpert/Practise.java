package com.nirmal.algoExpert;


public class Practise {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
        }
    }

    public static String longestPalindromicSubstring(String str) {
        // Write your code here.
        int[] longest = new int[]{0, 0};
        for (int i = 1; i < str.length(); i++) {
            int[] odd = findLongest(str, i - 1, i + 1);
            int[] even = findLongest(str, i - 1, i);
            int[] current = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
            longest = longest[1] - longest[0] > current[1] - current[0] ? longest : current;
        }

        return str.substring(longest[0], longest[1]);
    }

    public static int[] findLongest(String str, int left, int right) {
        while (left >= 0 && right < str.length()) {
            if (str.charAt(left) != str.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        return new int[]{left++, right};

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        BinaryTree left = new BinaryTree(2);
        BinaryTree right = new BinaryTree(3);
        tree.left = left;
        tree.right = right;

        System.out.println();
    }
}
