package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Saiyan mySaiyan = new Saiyan("Broly", 9000, 9000);
        Saiyan enemySaiyan = new Saiyan("Frieza", 7000, 6000);

        mySaiyan.displayInfo();
        enemySaiyan.displayInfo();

        mySaiyan.timeChamberTraining();
        enemySaiyan.timeChamberTraining();

        mySaiyan.attemptTransformation();
        enemySaiyan.attemptTransformation();

        boolean playing = true;

        System.out.println("Prepare Yourself Frieza!");

        while (playing) {
            System.out.println("\nWhat will you do?");
            System.out.println("1. TIME CHAMBER");
            System.out.println("2. Blast Frieza 💥");
            System.out.println("3. Run Away");

            System.out.print("Enter choice (1-3): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        mySaiyan.timeChamberTraining();
                        break;
                    case 2:
                        mySaiyan.blast(enemySaiyan);
                        break;
                    case 3:
                        System.out.println(" You Saiyan's have always been cowards! ");
                        playing = false;
                        break;
                    default:
                        System.out.println("Invalid choice! Choose 1, 2, or 3.");
                }
            } else {
                System.out.println("Please enter a number (1-3).");
                scanner.next(); // clear bad input
            }
        }

        scanner.close();
    }
}