package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        double kevSalary = 80000.50;
        double fredSalary = 90000.75;

        double highestSalary = Math.max(kevSalary, fredSalary);

        System.out.println("FRED BIG EARNER: " + highestSalary);

        double carPrice = 22000.60;
        double truckPrice = 33000.50;

        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("I guess i wont be buying a car anytime soon: " + lowestPrice);


        double randomNumber = Math.random();
        System.out.print("Number number NUMBER NUMBERRRR: " + randomNumber);

      }
    }