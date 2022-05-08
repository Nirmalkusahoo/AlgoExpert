import java.util.HashSet;
import java.util.Set;

public class test {

    /*public static boolean booleancheckValidString(String target, String[] arr) {

     *//*  Problem: Check whether the target string can be formed using the given array of strings

    function check(target, arr) {

    }

    console.log(check("abcdef", ["ab", "cd", "abc", "de", "def", "ef"])); // true*//*

        int targetIdx = 0;
        int arrIdx = 0;

        while (targetIdx < target.length() && arrIdx < arr.length) { //O(n)
            int individualMatchIdx = 0;
            while (individualMatchIdx < arr[arrIdx].length() && target.charAt(targetIdx) == arr[arrIdx].charAt(individualMatchIdx)) {
                targetIdx++;
                individualMatchIdx++;
                continue;
            }
            arrIdx++;
        }
        return target.length() == targetIdx;
    }*/

    public static boolean booleancheckValidString(String target, String[] arr) {

          /*  Problem: Check whether the target string can be formed using the given array of strings

    function check(target, arr) {

    }

    console.log(check("abcdef", ["ab", "cd", "abc", "de", "def", "ef"])); // true*/

        Set<String> set = new HashSet<>();
        for (String s : arr) {
            set.add(s);
        }

        int index = 0;
        while ( index<target.length() && set.contains(String.valueOf(target.charAt(index)))) {
            index++;
        }

        return target.length() == index;
    }

    public static void main(String[] args) {
//        System.out.println(booleancheckValidString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", new String[]{"a", "aaaaa", "aaaaaa"}));
        System.out.println(booleancheckValidString("abcdef", new String[]{"ab", "cd", "abc", "de", "def", "ef"}));
    }
}
