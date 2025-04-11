package org.example;

import java.util.Scanner;

public class Saiyan {

    String name;
    int powerLevel;
    int ki;
    boolean superSaiyan;

    // Constructor
    public Saiyan(String name, int powerLevel, int ki) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.ki = ki;
        this.superSaiyan = false;
    }

    public void displayInfo() {
        System.out.println("=== Saiyan Status ===");
        System.out.println("Name: " + name);
        System.out.println("Power Level: " + powerLevel);
        System.out.println("Ki: " + ki);
        System.out.println("Super Saiyan: " + (superSaiyan ? "Yes" : "No"));
        System.out.println("======================");
    }

    public void timeChamberTraining() {
        powerLevel += 1500;
        ki += 100;
        System.out.println(name + " SHOW YOUR SAIYAN PRIDE " + powerLevel + " AAAGGGHHGHGHHGHGHGHGHGHGHG ");
        System.out.println("======================");
    }

    public void attemptTransformation() {
        if (powerLevel >= 9000 && !superSaiyan) {
            superSaiyan = true;
            powerLevel *= 2;
            System.out.println(name + " transformed into a Super Saiyan! Power Level has doubled to " + powerLevel + "!");
        } else {
            System.out.println(name + " Where is your Saiyan pride. 😤");
            System.out.println("======================");
        }
    }

    public void blast(Saiyan enemy) {
        if (ki >= 30) {
            ki -= 30;
            enemy.ki -= 80;

            // Prevent negative ki
            if (enemy.ki < 0) {
                enemy.ki = 0;
            }

            System.out.println(name + " blasts " + enemy.name + " with a Kamehameha! 💥");
            System.out.println(enemy.name + "'s Ki drops to " + enemy.ki + ".");
            System.out.println(name + "'s Ki is now " + ki + ".");
        } else {
            System.out.println(name + " is too tired to blast! 😵");
        }


    }

    public String getName() {
        return name;
    }
}