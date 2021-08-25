package com.nirmal.algoExpert.strings;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        char[] arr=str.toCharArray();
        int start=0;
        int end=arr.length-1;
        while (start<end){
            if(arr[start] == arr[end]){
                start ++;
                end--;
                continue;
            } else {
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(PalindromeCheck.isPalindrome("abcdcba"));
    }
}
