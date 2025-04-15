package org.example;

import java.util.Scanner;

public class RentalCarCalc {

    private static final double BASE_RATE = 29.99;
    private static final double TOLL_TAG_RATE = 3.95;
    private static final double GPS_RATE = 2.95;
    private static final double ROADSIDE_RATE = 3.95;
    private static final double UNDERAGE_SURCHARGE_RATE = 0.30;

    private Scanner scanner;

    public RentalCarCalc() {
        scanner = new Scanner(System.in);
    }

    public void runCalculator() {
        System.out.print("Enter pickup date: ");
        String pickupDate = scanner.nextLine();

        System.out.print("Enter number of rental days: ");
        int rentalDays = scanner.nextInt();
        scanner.nextLine();

        double optionsCost = 0;

        System.out.print("Do you want an electronic toll tag? ($3.95/day) (yes/no): ");
        String tollTag = scanner.nextLine().toLowerCase();
        switch (tollTag) {
            case "yes":
                optionsCost += TOLL_TAG_RATE * rentalDays;
                break;
            case "no":
                break;
            default:
                System.out.println("Invalid input for toll tag. Assuming no.");
        }

        System.out.print("Do you want a GPS? ($2.95/day) (yes/no): ");
        String gps = scanner.nextLine().toLowerCase();
        switch (gps) {
            case "yes":
                optionsCost += GPS_RATE * rentalDays;
                break;
            case "no":
                break;
            default:
                System.out.println("Invalid input for GPS. Assuming no.");
        }

        System.out.print("Do you want roadside assistance? ($3.95/day) (yes/no): ");
        String roadside = scanner.nextLine().toLowerCase();
        switch (roadside) {
            case "yes":
                optionsCost += ROADSIDE_RATE * rentalDays;
                break;
            case "no":
                break;
            default:
                System.out.println("Invalid input for roadside assistance. Assuming no.");
        }

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double baseCost = BASE_RATE * rentalDays;
        double surcharge = (age < 25) ? baseCost * UNDERAGE_SURCHARGE_RATE : 0;
        double totalCost = baseCost + optionsCost + surcharge;

        System.out.println("\n=== Rental Car Estimate ===");
        System.out.println("Pickup Date: " + pickupDate);
        System.out.printf("Basic Rental (%.2f/day): $%.2f\n", BASE_RATE, baseCost);
        System.out.printf("Options Total: $%.2f\n", optionsCost);
        System.out.printf("Underage Surcharge: $%.2f\n", surcharge);
        System.out.printf("TOTAL COST: $%.2f\n", totalCost);
    }
}

