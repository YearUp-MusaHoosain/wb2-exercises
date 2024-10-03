package com.pluralsight;

import javax.swing.*;
import java.lang.reflect.Parameter;
import java.util.*;
import java.util.regex.Pattern;

public class HighScoreWins {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String userScores = promptForString("Please enter a game score ( ex. Home:Visitor|21:9 ) : ");

        int indexOfBar = userScores.indexOf("|");

        String afterBar = userScores.substring(indexOfBar +1);

        String[] scores = afterBar.split(Pattern.quote(":"));

        int leftScore = Integer.parseInt(scores[0]);
        int rightScore = Integer.parseInt(scores[1]);

        boolean isLeftWinner = (leftScore > rightScore);

        String teamNamesString = userScores.substring(0, indexOfBar);
        String[] teamNames = teamNamesString.split(Pattern.quote(":"));

        if (isLeftWinner){
            System.out.println(teamNames[0] + " wins!");
        }
        else {
            boolean isRightWinner = (rightScore > leftScore);
            if (isRightWinner){
                System.out.println(teamNames[1] + " wins!");
            }
            else {
                System.out.println("It's a tie!");
            }
        }


        System.out.println(userScores);
        System.out.println(indexOfBar);
        System.out.println(afterBar);
        System.out.println(Arrays.toString(scores));
        System.out.println(leftScore);
        System.out.println(rightScore);

    }

    public static String promptForString(String prompt){
        System.out.print(prompt);
        return sc.nextLine().trim();
    }
}
