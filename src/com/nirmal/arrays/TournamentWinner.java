package com.nirmal.arrays;

import java.util.*;

public class TournamentWinner {
    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> count = new HashMap<String, Integer>();

        for (int i = 0; i < results.size(); i++) {
            if (results.get(i) == 0) {
                String lang = competitions.get(i).get(1);
                if (count.get(lang) != null) {
                    count.put(lang, count.get(lang) + 1);
                } else {
                    count.put(lang, 1);
                }
            } else {
                String lang = competitions.get(i).get(0);
                if (count.get(lang) != null) {
                    count.put(lang, count.get(lang) + 1);
                } else {
                    count.put(lang, 1);
                }
            }
        }
        String winner = null;
        for (String key : count.keySet()) {
            if (winner == null) {
                winner = key;
            } else if (count.get(key) > count.get(winner)) {
                winner = key;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        List<String> comp1 = new ArrayList<String>(Arrays.asList(new String[]{"html", "c"}));
        List<String> comp2 = new ArrayList<String>(Arrays.asList(new String[]{"C", "Py"}));
        List<String> comp3 = new ArrayList<String>(Arrays.asList(new String[]{"Py", "HTML"}));

        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        competitions.add((ArrayList<String>) comp1);
        competitions.add((ArrayList<String>) comp2);
        competitions.add((ArrayList<String>) comp3);
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(new Integer[]{0, 0, 1}));
        System.out.println(TournamentWinner.tournamentWinner(competitions, result));
//        System.out.println(competitions);
//        System.out.println(result);
    }
}
