package com.pluralsight;

public class Dice
{
    public int roll(){
        int minValue = 1;
        int maxValue = 7;
        int randomNumber = (int)(Math.random() * maxValue) + minValue;
        return randomNumber;
    }
}
