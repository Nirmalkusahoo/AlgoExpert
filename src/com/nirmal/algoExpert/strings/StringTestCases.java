package com.nirmal.algoExpert.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTestCases {
    PalindromeCheck palindromeCheck= new PalindromeCheck();

    @Test
    public void isPalindrome(){
        assertFalse(palindromeCheck.isPalindrome("Test"));
        assertFalse(palindromeCheck.isPalindrome("Test"),"Test is a plaindrome");
    }

    @Test
    public void isPalindrome2(){
        assertTrue(palindromeCheck.isPalindrome("CTC"));
    }
}
