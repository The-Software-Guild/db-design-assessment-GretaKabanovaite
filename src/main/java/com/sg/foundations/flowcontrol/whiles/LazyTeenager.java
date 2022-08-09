package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args){

        Random randomizer = new Random();
        int reminder = 0;
        boolean isRoomClean = false;

        do{
            reminder++;
            if(reminder >= 1 && reminder < 7) {
                System.out.println("Clean your room!");
                if(reminder == 2) {
                    System.out.println("This is the " + reminder + "nd time I am reminding you!");
                } else if(reminder == 3) {
                    System.out.println("This is the " + reminder + "rd time I am reminding you!");
                } else if (reminder > 3) {
                    System.out.println("This is the " + reminder + "th time I am reminding you!");
                }
            } else if (reminder >= 7) {
                System.out.println("You still haven't cleaned your room?! I won't be reminding you for the " + reminder + "th time.");
                System.out.println("You're grounded! And I'm confiscating your XBox!");
                break;
            }
            int chance = randomizer.nextInt(101);
            //System.out.println("Debug: percent is " + reminder*10 + " and roll is " + chance);
            if(chance <= reminder*10){
                if(reminder != 1) {
                    System.out.println("OMG, I said I will...");
                } else {
                    System.out.println("Sure!");
                }
                isRoomClean = true;
            } else {
                System.out.println("Yes, yes, one sec...");
            }
            System.out.println();
        } while(!isRoomClean);
    }
}
