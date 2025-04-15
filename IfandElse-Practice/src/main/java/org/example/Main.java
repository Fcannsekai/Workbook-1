package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your current salary: $");
        int salary = scanner.nextInt();

        if (salary < 1000) {
            System.out.println("You might be cooked");
        } else if (salary > 2000 && salary < 5000) {
            System.out.println("Your almost 30! LOCK IN");
        } else if (salary > 5000 && salary < 10000) {
            System.out.println("Now we are talking");
        } else if (salary == 10000) {
            System.out.println("This is what I am talking about");
        }

        if (salary < 10000) {
            int difference = 10000 - salary;
            System.out.println("You need to earn $" + difference + " more to reach $10,000.");
        } else if (salary > 10000) {
            System.out.println("You've already passed $10,000! Great job!");
        }

        System.out.print("\nEnter your years of experience: ");
        int experience = scanner.nextInt();

        System.out.print("Enter how many programming languages you know: ");
        int languages = scanner.nextInt();

        if (experience > 5 && languages > 3) {
            System.out.println("You are a senior developer!");
        } else if (experience >= 2 && experience <= 5 && languages >= 2) {
            System.out.println("You're a mid level developer.");
        } else if (experience < 2 || languages < 2) {
            System.out.println("You're a junior developer.");
        }

        System. out.println("Username: ");
        String username = scanner.nextLine();
        if (!username.isEmpty()){

            System. out.println("Access Granted. \nWelcome " + username + "!");
        }
    }


    }
