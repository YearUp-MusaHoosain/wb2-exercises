package com.pluralsight;

import java.util.*;

public class FullNameParser {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String fullName = promptForName("Please enter your FULL name: ");


        int indexOfFirstSpace = fullName.indexOf(' ');
        String firstName = fullName.substring(0, indexOfFirstSpace);

        String endPart = fullName.substring(indexOfFirstSpace + 1);
        String middleName;
        String lastName;

        int indexOfSpaceOfEndingPart = endPart.indexOf(" ");
        if (indexOfSpaceOfEndingPart < 0){
            middleName = "";
            lastName = endPart;
        }
        else {
            middleName = endPart.substring(0, indexOfSpaceOfEndingPart);
            lastName = endPart.substring(indexOfSpaceOfEndingPart + 1);
        }
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
    }


    public static String promptForName(String prompt){
        System.out.print(prompt);
        return sc.nextLine().trim();
    }

}
