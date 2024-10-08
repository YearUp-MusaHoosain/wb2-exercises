package com.pluralsight;

public class RollTheDiceApp {

    public static void main(String[] args) {

        Dice dice = new Dice();
        int roll1;
        int roll2;

        int counterTwo = 0;
        int counterFour = 0;
        int counterSix = 0;
        int counterSeven = 0;

        for (int i = 0; i <= 100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();

            int sum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + "-" + roll2 + "   Sum: " + sum);

            counterTwo = (sum == 2) ? counterTwo + 1 : counterTwo;
            counterFour = (sum == 4) ? counterFour + 1 : counterFour;
            counterSix = (sum == 6) ? counterSix + 1 : counterSix;
            counterSeven = (sum == 7) ? counterSeven + 1 : counterSeven;
        }

        System.out.println("Two Counter: " + counterTwo);
        System.out.println("Four Counter: " + counterFour);
        System.out.println("Six Counter: " + counterSix);
        System.out.println("Seven Counter: " + counterSeven);


    }
}
