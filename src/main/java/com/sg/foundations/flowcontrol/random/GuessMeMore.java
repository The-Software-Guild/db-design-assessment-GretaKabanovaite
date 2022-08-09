package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main (String[] args){
        Random randomizer = new Random();

        Scanner myScanner = new Scanner(System.in);

        int randNr = randomizer.nextInt(201)-100;
        boolean guessed = false;
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        System.out.println("Debug: my chosen nr is " + randNr);

        while(!guessed) {
            System.out.print("Your guess: ");
            int guess = myScanner.nextInt();

            if(guess == randNr){
                guessed = true;
                System.out.println();
                System.out.println("Wow, nice guess! That was it!");
            } else if (guess > randNr){
                System.out.println("Ha, nice try - too high! Try again!");
            } else {
                System.out.println("Ha, nice try - too low! Try again!");
            }
        }
    }
}
