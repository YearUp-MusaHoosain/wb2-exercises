package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder
{
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please provide the following information: ");
        StringBuilder FullName = PromptForAddress("Full name: ");
        StringBuilder BillingStreet = PromptForAddress("Billing Street: ");
        StringBuilder BillingCity = PromptForAddress("Billing City: ");
        StringBuilder BillingState = PromptForAddress("Billing State: ");
        StringBuilder BillingZip = PromptForAddress("Billing Zip: ");
        StringBuilder ShippingStreet = PromptForAddress("Shipping Street: ");
        StringBuilder ShippingCity = PromptForAddress("Shipping City: ");
        StringBuilder ShippingState = PromptForAddress("Shipping State: ");
        StringBuilder ShippingZip = PromptForAddress("Shipping Zip: ");

        String FullAddress =
                        FullName + "\n \n" +
                        BillingStreet + "\n" +
                        BillingCity + "\n" +
                        BillingState + "\n" +
                        BillingZip + "\n \n" +
                        ShippingStreet + "\n" +
                        ShippingCity + "\n" +
                        ShippingState + "\n" +
                        ShippingZip + "\n";

        System.out.println(FullAddress);

    }

    public static StringBuilder PromptForAddress (String prompt){
        System.out.print(prompt);
        String AddressPiece = sc.nextLine().trim();
        return sb.append(AddressPiece);
    }
}
