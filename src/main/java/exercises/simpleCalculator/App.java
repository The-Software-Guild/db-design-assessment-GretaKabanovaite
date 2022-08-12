package exercises.simpleCalculator;

import java.util.Scanner;

public class App {
    public static void main (String[] args){
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        while(true){
            System.out.println("What would you like to do?");
            System.out.println("1. Add two integers");
            System.out.println("2. Subtract two integers");
            System.out.println("3. Multiply two integers");
            System.out.println("4. Divide two integers");
            System.out.println("5. Exit the program");

            try {
                Scanner myScanner = new Scanner(System.in);
                int choice = Integer.parseInt(myScanner.nextLine());
                try {
                    if(choice == 1 || choice == 2 || choice == 3 || choice == 4){
                        System.out.print("Please enter the first number: ");
                        int i = Integer.parseInt(myScanner.nextLine());
                        System.out.println("Please enter the second number: ");
                        int j = Integer.parseInt(myScanner.nextLine());
                        if(choice == 1){
                            System.out.println(i + " + " + j + " = " + simpleCalculator.addition(i, j));
                        } else if (choice == 2){
                            System.out.println(i + " - " + j + " = " + simpleCalculator.subtraction(i, j));
                        } else if (choice == 3) {
                            System.out.println(i + " * " + j + " = " + simpleCalculator.multiplication(i, j));
                        } else {
                            try {
                                System.out.println(i + " \\ " + j + " = " + simpleCalculator.division(i, j));
                            } catch (ArithmeticException e) {
                                System.out.println("You cannot divide by 0, sorry.");
                            }
                        }
                    } else if (choice == 5) {
                        System.out.println("Thank you and have a nice day!");
                        break;
                    } else {
                        System.out.println("Invalid input, please try again.");
                    }
                } catch (NumberFormatException a){
                    System.out.println("Please enter a valid integer number.");
                }


            } catch (NumberFormatException e){
                System.out.println("Please use a number 1 to 5 to choose a choice.");
            }
        }
    }
}
