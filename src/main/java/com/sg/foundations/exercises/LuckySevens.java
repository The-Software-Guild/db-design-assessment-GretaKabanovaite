package com.sg.foundations.exercises;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public void playLuckySevens(){

        Random randomizer = new Random();

        System.out.print("How many dollars do you want to bet? ");
        Scanner myScanner = new Scanner(System.in);
        int initialMoney = Integer.parseInt(myScanner.nextLine());
        int count = 0;
        int countMax = 0;
        int maxMoney = initialMoney;
        while(initialMoney > 0) {
            if((randomizer.nextInt(8) + 1) + (randomizer.nextInt(8) +1 ) != 7){
                initialMoney = initialMoney - 1;
            } else {
                initialMoney = initialMoney + 4;
            }
            if(initialMoney > maxMoney) {
                maxMoney = initialMoney;
                countMax = count+1;
            }
            count++;
        }
        System.out.println("You are broke after " + count + " rolls.");
        System.out.println("You should have quit after " + countMax + " when you had $" + maxMoney + ".");
    }
}
