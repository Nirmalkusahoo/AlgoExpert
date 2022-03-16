package com.nirmal.leetcode;

public class ID67AddBinary {
    public String addBinary(String a, String b) {

        int fl = a.length() - 1;
        int sl = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (fl >= 0 || sl >= 0 || carry !=0) {
            int sum = carry;
            if (fl >= 0) {
                sum = sum + a.charAt(fl) - '0';
            }
            if (sl >= 0) {
                sum = sum + b.charAt(sl) - '0';
            }

            sb.append(sum % 2);
            carry = sum / 2;
            fl--;
            sl--;

        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println('0');
    }
}
