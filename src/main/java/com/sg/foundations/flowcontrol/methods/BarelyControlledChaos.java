package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

public class BarelyControlledChaos {
    private static final Random randomizer = new Random();
    public static void main(String[] args) {

        String[] colours = {"blue", "green", "orange", "violet", "pink"};

        String color = getColor(colours); // call color method here
        String animal = getAnimal(new String[] {"Elephant", "Giraffe", "Dog", "Kitten", "Wolf"}); // call animal method again here
        String colorAgain = getColor(colours); // call color method again here
        int weight = getRandomNumberInRange(5, 200); // call number method,
        // with a range between 5 - 200
        int distance = getRandomNumberInRange(10, 20); // call number method,
        // with a range between 10 - 20
        int number = getRandomNumberInRange(10000, 20000); // call number method,
        // with a range between 10000 - 20000
        int time = getRandomNumberInRange(2, 6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String getColor(String[] colours){
        int nr = randomizer.nextInt(0, colours.length);
        return colours[nr];
    }
    public static String getAnimal(String[] animals){
        int nr = randomizer.nextInt(0, animals.length);
        return animals[nr];
    }
    public static int getRandomNumberInRange(int start, int end){
        return randomizer.nextInt(start, end+1);
    }
}
