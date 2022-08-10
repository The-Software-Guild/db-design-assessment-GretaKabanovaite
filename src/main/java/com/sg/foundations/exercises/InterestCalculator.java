package com.sg.foundations.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestCalculator {
    public void playInterestCalculator(){
        DecimalFormat f = new DecimalFormat("##.00");

        System.out.print("How much would you like to invest? ");
        Scanner myScanner = new Scanner(System.in);
        double firstInvestment = Double.parseDouble(myScanner.nextLine());

        System.out.print("How many years are you investing? ");
        int years = Integer.parseInt(myScanner.nextLine());

        System.out.print("What is the annual interest rate % growth? ");
        int interestRate = Integer.parseInt(myScanner.nextLine());

        System.out.println("Please choose from [1] quarterly, [2] monthly, or [3] daily interest compound periods. ");
        String period = myScanner.nextLine();
        int periodNr = 4;
        switch (period) {
            case "quarterly", "1" -> period = "quarterly";
            case "monthly", "2" -> {
                periodNr = 12;
                period = "monthly";
            }
            case "daily", "3" -> {
                periodNr = 365;
                period = "daily";
            }
        }


        System.out.println("Calculating...");
        System.out.println("Chosen compound period: " + period + ".");
        for(int i = 1; i<=years; i++){
            System.out.println("Year " + i + ":");
            System.out.println("Began with $" + f.format(firstInvestment));
            double earned;
            double earnedTotalPerYear = 0;
            for(int j=0; j<periodNr; j++){
                earned = firstInvestment * ((double) interestRate/periodNr/ 100.0);
                earnedTotalPerYear += earned;
                firstInvestment = firstInvestment + earned;
            }
            System.out.println("Earned $" + f.format(earnedTotalPerYear));
            System.out.println("Ended with $" + f.format(firstInvestment));
            System.out.println();
        }
    }
}
