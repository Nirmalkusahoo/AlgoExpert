package com.nirmal.algoExpert.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumberMnemonics {

    public static Map<Character, String[]> DIGIT_LETTERS = new HashMap<Character, String[]>();

    static {
        DIGIT_LETTERS.put('0', new String[]{"0"});
        DIGIT_LETTERS.put('1', new String[]{"1"});
        DIGIT_LETTERS.put('2', new String[]{"a", "b", "c"});
        DIGIT_LETTERS.put('3', new String[]{"d", "e", "f"});
        DIGIT_LETTERS.put('4', new String[]{"g", "h", "i"});
        DIGIT_LETTERS.put('5', new String[]{"j", "k", "l"});
        DIGIT_LETTERS.put('6', new String[]{"m", "n", "o"});
        DIGIT_LETTERS.put('7', new String[]{"p", "q", "r", "s"});
        DIGIT_LETTERS.put('8', new String[]{"t", "u", "v"});
        DIGIT_LETTERS.put('9', new String[]{"w", "x", "y", "z"});
    }

    public ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
        // Write your code here.
        String[] currentMnemonics = new String[phoneNumber.length()];
        Arrays.fill(currentMnemonics, "0");

        ArrayList<String> mnemonicsFound = new ArrayList<String>();
        mnemonicsHelper(0, currentMnemonics, mnemonicsFound, phoneNumber);
        return mnemonicsFound;
    }

    public static void mnemonicsHelper(int idx, String[] currentMnemonics, ArrayList<String> mnemonicsFound, String phoneNumber) {
        if (idx == phoneNumber.length()) {
            String mnemonic = String.join("", currentMnemonics);
            mnemonicsFound.add(mnemonic);
        } else {
            char number = phoneNumber.charAt(idx);
            String[] letterList = DIGIT_LETTERS.get(number);
            for (String letter : letterList) {
                currentMnemonics[idx] = letter;
                mnemonicsHelper(idx + 1, currentMnemonics, mnemonicsFound, phoneNumber);
            }
        }
    }
}
