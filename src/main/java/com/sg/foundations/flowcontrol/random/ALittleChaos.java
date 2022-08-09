package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class ALittleChaos {
    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        int mathStatNr = randomizer.nextInt(100);
        int mathStatement = mathStatNr/2;
        int mathStatementDividing = 50/mathStatNr;

        System.out.println("You can use random in math statements.");
        System.out.println(mathStatNr + "/2" + " = " + mathStatement);
        System.out.println("50/" + mathStatNr + " = " + mathStatementDividing);
        System.out.println("The above one will fail some time, when the random number is 0 as division by 0 is illegal.");
        System.out.println();


        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 50 - 100: ");

        System.out.print(randomizer.nextInt(51)+50 + ", ");
        System.out.print(randomizer.nextInt(51)+50 + ", ");
        System.out.print(randomizer.nextInt(51)+50 + ", ");
        System.out.print(randomizer.nextInt(51)+50 + ", ");
        System.out.print(randomizer.nextInt(51)+50 + ", ");
        System.out.println(randomizer.nextInt(51) + 50);
        // Changing .nextInt(101) to .nextInt(51)+50 gets a random number from 0 to 50 (inclusive) and ads 50 to it.

        char randChar; // No nextChar, get random char by first getting a random int then use it to look up the char in the char table.
        boolean randBool = randomizer.nextBoolean(); //Will either get false or true
        byte [] b = new byte[5]; // to get a random byte, first have to create at least one byte to pass to .nextBytes (probably?)
        randomizer.nextBytes(b);
        System.out.println(b[0] + " " +  b[1]+ " " + b[2] + " " + b[3] + " " + b[4]);
        int randInt = randomizer.nextInt(); // Already seen behaviour earlier.
        short randShort; // does not exist
        long randLong = randomizer.nextLong(); // Acts same as random int, range different
        double randDouble = randomizer.nextDouble(); // Will get a value between 0 and 0.99
        float randFloat = randomizer.nextFloat(10); //Similar to double
        System.out.println("Random Float: " + randFloat);


    }
}
