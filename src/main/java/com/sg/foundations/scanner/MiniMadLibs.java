package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args){
        String noun, adjective, noun2, number, adjective2;
        String pluralNoun, pluralNoun2, pluralNoun3, verbPresentTense, sameVerbPastTense;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Let's play MAD LIBS!");
        System.out.println();
        System.out.print("I need a noun: ");
        noun = myScanner.nextLine();
        System.out.print("Now an adjective: ");
        adjective = myScanner.nextLine();
        System.out.print("Another noun: ");
        noun2 = myScanner.nextLine();
        System.out.print("And a number: ");
        number = myScanner.nextLine();
        System.out.print("Another adjective: ");
        adjective2 = myScanner.nextLine();
        System.out.print("A plural noun: ");
        pluralNoun = myScanner.nextLine();
        System.out.print("Another one: ");
        pluralNoun2 = myScanner.nextLine();
        System.out.print("One more: ");
        pluralNoun3 = myScanner.nextLine();
        System.out.print("A verb (infinitive form): ");
        verbPresentTense = myScanner.nextLine();
        System.out.print("Same verb (past participle): ");
        sameVerbPastTense = myScanner.nextLine();
        System.out.println();

        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.print(noun.substring(0, 1).toUpperCase() + noun.substring(1) + ": the " + adjective + " frontier. These are the voyages of the starship " + noun2 + ". ");
        System.out.println("Its " + number + "-year mission: to explore strange " + adjective2 + " " + pluralNoun
                + ", to seek out " + adjective2 + " " + pluralNoun2 + " and " + adjective2 + " " + pluralNoun3
        + ", to boldly " + verbPresentTense + " where no has " + sameVerbPastTense + " before.");
    }
}
