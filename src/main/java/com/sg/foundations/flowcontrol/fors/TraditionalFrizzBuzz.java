package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFrizzBuzz {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);


        System.out.print("Please insert your chosen number: ");
        int chosenNr = myScanner.nextInt();
        int count = 0;

        for(int i=0; count<chosenNr; i++) {

            if(i%3 == 0 && i%5 == 0 && i != 0) {
                System.out.println("fizz buzz");
                count++;
            } else if (i%3 == 0 && i !=0) {
                System.out.println("fizz");
                count++;
            } else if (i%5 == 0 && i !=0) {
                System.out.println("buzz");
                count++;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!");
    }
}
