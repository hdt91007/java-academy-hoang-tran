package com.pluralsite;

import java.util.Locale;
import java.util.Scanner;

public class Highscores {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("PLease input the teams and scores in the following format Team1:Team2|Score1:Score2 ");
        String MatchHistory = scan.nextLine();
        //String MatchHistory = "Forgs:Bulls|12:9";
        System.out.println(MatchHistory);

        String team1 = MatchHistory.substring(0, MatchHistory.indexOf(":"));
        System.out.println(team1.trim());
        MatchHistory = MatchHistory.substring(MatchHistory.indexOf(":"));

        String team2 = MatchHistory.substring(0 + 1, MatchHistory.indexOf("|"));
        System.out.println(team2.trim());
        MatchHistory = MatchHistory.substring(MatchHistory.indexOf("|"));

        String score1 = MatchHistory.substring(0 + 1, MatchHistory.indexOf(":"));
        System.out.println(score1.trim());
        MatchHistory = MatchHistory.substring(MatchHistory.indexOf(":"));

        String score2 = MatchHistory.substring(MatchHistory.indexOf(":") + 1);
        System.out.println(score2.trim());

        if (Integer.parseInt(score1) > Integer.parseInt(score2)) {
            System.out.println(team1 + " wins");
        }
        else if (Integer.parseInt(score1) < Integer.parseInt(score2)){
            System.out.println(team2 + " wins");
        }
        else System.out.println("Game was a tie");
    }
}