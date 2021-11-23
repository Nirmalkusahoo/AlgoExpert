package com.nirmal.algoExpert.strings;

import java.util.ArrayList;

public class ValidIPAddress {
    public ArrayList<String> validIPAddresses(String string) {
        // Write your code here.
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 1; i < Math.min(string.length(), 4); i++) {
            String[] current = new String[]{"", "", "", ""};

            current[0] = string.substring(0, i);
            if (!isValid(current[0])) {
                continue;
            }

            for (int j = i + 1; j < Math.min(string.length(), i + 4); j++) {
                current[1] = string.substring(i, j);
                if (!isValid(current[1])) {
                    continue;
                }

                for (int k = j + 1; k < Math.min(string.length(), j + 4); k++) {
                    current[2] = string.substring(j, k);
                    current[3] = string.substring(k);

                    if (isValid(current[2]) && isValid(current[3])) {
                        list.add(join(current));
                    }
                }
            }
        }
        return list;
    }

    public boolean isValid(String str) {
        int parsedValue = Integer.parseInt(str);
        if (parsedValue > 255) {
            return false;
        }
        return str.length() == Integer.toString(parsedValue).length();
    }

    public String join(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int l = 0; l < array.length; l++) {
            sb.append(array[l]);
            if (l < array.length - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
