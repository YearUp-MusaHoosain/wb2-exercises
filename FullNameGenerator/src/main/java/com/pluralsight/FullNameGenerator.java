package com.pluralsight;
import java.util.*;


public class FullNameGenerator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your full name (First Middle Last): ");
        String firstName = promptForName("First name: ");
        String middleName = promptForName("Middle name: ");
        String lastName = promptForName("Last name: ");
        String suffix = promptForName("Suffix: ");

        String fullName;

        if (middleName.isBlank()){
            if (suffix.isBlank()){
                fullName = firstName + " " + lastName;
            }
            else {
                fullName = firstName + " " + middleName + " " + lastName;
            }
        }
        else {
            if (suffix.isBlank()){
                fullName = firstName + " " + middleName + " " + lastName;
            }
            else {
                fullName = firstName + " " + middleName + " " + lastName + ", " + suffix;
            }
        }

        //Output
        System.out.println("Hello " + fullName);


    }

    public static String promptForName(String prompt){
        System.out.print(prompt);
        String userInput = sc.nextLine().trim();
        return userInput;
    }
}


/* always first and last name
* might have middle name
* if no middle or suffix, no spaces between first and last name
* if suffix, the full name should include a comma before the suffix*/
