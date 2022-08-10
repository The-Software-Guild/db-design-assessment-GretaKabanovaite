package com.sg.foundations.exercises;

import java.util.Scanner;

public class Factorizer {
    public void playFactorizer(){

        System.out.print("What number would you like to factor? ");
        Scanner myScanner = new Scanner(System.in);
        int input = Integer.parseInt(myScanner.nextLine());
        System.out.println("The factor of " + input + " are:");
        int count = 0;
        int sum =0;
        for(int i=1; i<=input; i++) {
            if (input%i == 0) {
                count++;
                sum = sum + i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(input + " has " + count + " factors.");
        if(sum - input == input) {
            System.out.println(input + " is a perfect number.");
        } else {
            System.out.println(input + " is not a perfect number.");
        }

        if(input > 1 && count == 2) {
            System.out.println(input + " is a prime number.");
        } else {
            System.out.println(input + " is not a prime number.");
        }
    }
}
