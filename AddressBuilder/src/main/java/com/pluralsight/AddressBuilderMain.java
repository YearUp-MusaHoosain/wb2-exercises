package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderMain
{
    static StringBuilder Address = new StringBuilder();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please provide the following information: ");
        Address.append(PromptForAddress("Full name: "));
        Address.append("\n");
        Address.append("\n");
        Address.append(PromptForAddress("Billing Street: "));
        Address.append("\n");
        Address.append(PromptForAddress("Billing City: "));
        Address.append("\n");
        Address.append(PromptForAddress("Billing State: "));
        Address.append("\n");
        Address.append(PromptForAddress("Billing Zip: "));
        Address.append("\n");
        Address.append("\n");
        Address.append(PromptForAddress("Shipping Street: "));
        Address.append("\n");
        Address.append(PromptForAddress("Shipping City: "));
        Address.append("\n");
        Address.append(PromptForAddress("Shipping State: "));
        Address.append("\n");
        Address.append(PromptForAddress("Shipping Zip: "));
        Address.append("\n");

        String FullAddress = Address.toString();
        System.out.println(FullAddress);

    }

    public static String PromptForAddress (String prompt){
        System.out.print(prompt);
        return sc.nextLine().trim();
    }
}
