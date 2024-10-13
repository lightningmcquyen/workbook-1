package com.pluralsight.sandwich;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanley = new Scanner(System.in);
        boolean stillHungry = true;

        double regularBasePrice = 5.45;
        double largeBasePrice = 8.95;
        double sandwichPrice;

        while (stillHungry) {
            System.out.println("\nWelcome to LightningMcQuyen's!");
            System.out.println("Our regular sized sandwich is $5.45 and our large is $8.95!");
            System.out.println("What size sandwich would you like today?");
            System.out.println("Enter (1) for Regular");
            System.out.println("Enter (2) for Large");
            int choice = scanley.nextInt();

            if (choice == 1) {
                sandwichPrice = regularBasePrice;
            } else if (choice == 2) {
                sandwichPrice = largeBasePrice;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
                continue;
            }

            // Loaded sandwich?
            System.out.print("Would you like your sandwich loaded (yes/no)? ");
            String loadedResponse = scanley.next().toLowerCase();

            if (loadedResponse.equals("yes")) {
                if (choice == 1) {
                    sandwichPrice += 1.00;
                } else {
                    sandwichPrice += 1.75;
                }
            }

            // Ask for age and apply discounts
            System.out.println("Seniors and Students receive a discount.");
            System.out.print("What is your age? ");
            int age = scanley.nextInt();

            if (age <= 17) {
                sandwichPrice *= 0.90; // 10% discount for students
            } else if (age >= 65) {
                sandwichPrice *= 0.80; // 20% discount for seniors
            }

            // Show the final price
            System.out.printf("Your final price is: $%.2f\n", sandwichPrice);

            // Ask if they want to order another sandwich
            System.out.print("Would you like to order another sandwich? (yes/no): ");
            String response = scanley.next().toLowerCase();
            stillHungry = response.equals("yes");
        }

        scanley.close();
        System.out.println("Thank you for visiting LightningMcQuyen's!");
    }
}
