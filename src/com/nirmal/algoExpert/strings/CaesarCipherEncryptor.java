package com.nirmal.algoExpert.strings;

public class CaesarCipherEncryptor {
    // Solution1:
    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        key = key % 26;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getNewChar(arr[i], key);
        }
        return String.valueOf(arr);
    }

    public static char getNewChar(char c, int key) {
        int ascii = c;
        int newAscii = ascii + key;
        if (newAscii > 122) {
            char newChar = (char) (96 + newAscii - 122);
            return newChar;
        } else {
            return (char) newAscii;
        }
    }
    // Solution2
    /*public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        char[] arr=str.toCharArray();
        if(key>26){
            while(key>26){
                key=key-26;
            }
        }
        for(int i=0;i<arr.length;i++){
           arr[i] = getNewChar(arr[i],key);
        }
        return String.valueOf(arr);
    }

    public static char getNewChar(char c,int key){
        int ascii= c;
        int newAscii =ascii+key;
        if(newAscii>122){
            char newChar= (char) (96+ newAscii-122);
           return newChar;
        } else {
            return (char)newAscii;
        }
    }*/

    public static void main(String[] args) {
        System.out.println(CaesarCipherEncryptor.caesarCypherEncryptor("abc", 57));
    }
}
