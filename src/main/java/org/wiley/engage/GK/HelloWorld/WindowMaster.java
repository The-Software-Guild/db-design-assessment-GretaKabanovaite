package org.wiley.engage.GK.HelloWorld;

import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args) {
        float height;
        float width;

        float area;
        float perimeter;
        float cost;

        float trimCost;
        float windowCost;

        int windowCount;

        boolean isValid = false;

        do{
            try{
                Scanner myScanner = new Scanner(System.in);
                System.out.println("Please enter the height in meters.");
                height = Float.parseFloat(myScanner.nextLine());
                System.out.println("Please enter the width in meters.");
                width = Float.parseFloat(myScanner.nextLine());
                System.out.println("Please enter the cost of window.");
                windowCost = Float.parseFloat(myScanner.nextLine());
                System.out.println("Please enter the cost of trim.");
                trimCost = Float.parseFloat(myScanner.nextLine());
                System.out.println("How many windows have you got?");
                windowCount = Integer.parseInt(myScanner.nextLine());
                isValid = true;
                area = height*width;
                perimeter = height*2+width*2;
                cost = windowCount*((trimCost * area) + (windowCost * perimeter));
                System.out.println("Your area: " + area + " meters.");
                System.out.println("Your perimeter: " + perimeter + " meters.");
                System.out.println("Your cost: " + cost + " pounds.");
            } catch (NumberFormatException e) {
                System.out.println("You didn't enter valid numbers.");
            }


        } while (!isValid);

    }
}
