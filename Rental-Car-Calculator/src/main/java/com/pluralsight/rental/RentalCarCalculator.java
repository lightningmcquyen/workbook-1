package com.pluralsight.rental;

import java.util.Scanner;

public class RentalCarCalculator {

    static double basicRentalRate = 29.99;
    static double tollTagCost = 3.95;
    static double gpsCost = 2.95;
    static double roadsideAssistanceCost = 3.95;
    static double underageSurchargeRate = .30;

    public static void main(String[] args) {
        Scanner scanley = new Scanner(System.in);

        System.out.print("Enter pickup date (MM/DD/YYYY): ");
        String pickupDate = scanley.nextLine();
        System.out.print("Enter number of days for the rental: ");
        int numberOfDays = scanley.nextInt();

        // Options cost initialization
        double optionsCost = 0;

        // Electronic toll tag option
        System.out.print("Do you want an electronic toll tag? (yes/no): ");
        String tollTagResponse = scanley.nextLine().toLowerCase();
        switch (tollTagResponse) {
            case "yes":
                optionsCost += tollTagCost * numberOfDays;
                break;
            case "no":
                break;
        }
        scanley.nextLine();

        // GPS option
        System.out.print("Do you want a GPS? (yes/no): ");
        String gpsResponse = scanley.nextLine().toLowerCase();
        switch (gpsResponse) {
            case "yes":
                optionsCost += gpsCost * numberOfDays;
                break;
            case "no":
                break;
        }

        // Roadside assistance
        System.out.print("Do you want roadside assistance? (yes/no): ");
        String roadsideResponse = scanley.nextLine().toLowerCase();

        switch (roadsideResponse) {
            case "yes":
                optionsCost += roadsideAssistanceCost * numberOfDays;
                break;
            case "no":
                break;
        }

        // Cost calculations
        double basicRentalCost = basicRentalRate * numberOfDays;
        double totalCost = basicRentalCost + optionsCost;

        System.out.print("Enter your current age: ");
        int age = scanley.nextInt();

        // Underage driver surcharge
        if (age < 25) {
            totalCost += basicRentalCost * underageSurchargeRate;
        }

        System.out.println("\n--- Rental Car Cost Estimate ---\n");
        System.out.printf("Pickup Date: %s\n", pickupDate);
        System.out.printf("Basic Car Rental Cost: $%.2f\n", basicRentalCost);
        System.out.printf("Options Cost: $%.2f\n", optionsCost);
        if (age < 25) {
            System.out.printf("Underage Driver Surcharge: $%.2f\n", basicRentalCost * underageSurchargeRate);
        }
        System.out.printf("Total Cost: $%.2f\n", totalCost);
        scanley.close();
    }
}