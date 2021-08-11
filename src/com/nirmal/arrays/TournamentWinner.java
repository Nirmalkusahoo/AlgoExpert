package com.nirmal.arrays;

import java.util.*;

public class TournamentWinner {
    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        String currentBestTeam = "";
        count.put(currentBestTeam, 0);

        for (int i = 0; i < competitions.size(); i++) {
            String homeTeam = competitions.get(i).get(0);
            String awayTeam = competitions.get(i).get(1);
            String winingTeam = results.get(i) == 1 ? homeTeam : awayTeam;

            updateScores(winingTeam, 3, count);

            if (count.get(winingTeam) > count.get(currentBestTeam)) {
                currentBestTeam = winingTeam;
            }

        }
        return currentBestTeam;
    }

    public static void updateScores(String winingTeam, int score, HashMap<String, Integer> count) {
        if (!count.containsKey(winingTeam)) {
            count.put(winingTeam, 0);
        }
        count.put(winingTeam, count.get(winingTeam) + score);
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
